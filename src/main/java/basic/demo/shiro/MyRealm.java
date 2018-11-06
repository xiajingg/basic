package basic.demo.shiro;

import basic.demo.po.UserInfoPO;
import basic.demo.po.UserRolePO;
import basic.demo.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: xiajing
 * @Date: 2018-11-04 12:57:51
 * @Description: 认证和授权具体实现
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;

    /**
     * 为当前subject授权
     * @param principalCollection
     * @return AuthorizationInfo
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Map<String, Object> params = new HashMap<>();
        params.put("userCode", (String) super.getAvailablePrincipal(principalCollection));
        List<UserRolePO> userRoleInfos = userService.getUserRoleInfos(params);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        if(!userRoleInfos.isEmpty()) {
            for(UserRolePO role : userRoleInfos) {
                info.addRole(role.getRoleCode());
            }
        }
        return info;
    }

    /**
     * 认证登陆subject身份
     * @param authenticationToken
     * @return AuthenticationInfo
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Map<String, Object> params = new HashMap<>();
        params.put("userCode", (String)authenticationToken.getPrincipal());
        List<UserInfoPO> userInfos = userService.getUserInfos(params);
        if (userInfos.isEmpty()) {
            throw new UnknownAccountException();
        } else if(userInfos.size() > 1) {
            throw new DisabledAccountException();
        } else {
            UserInfoPO user = userInfos.get(0);
            // 校验密码
            return new SimpleAuthenticationInfo(authenticationToken.getPrincipal(), user.getUserPwd(), ByteSource.Util.bytes("2w@W"),  getName());
        }
    }

}
