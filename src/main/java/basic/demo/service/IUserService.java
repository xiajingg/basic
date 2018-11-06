package basic.demo.service;

import basic.demo.po.UserInfoPO;
import basic.demo.po.UserPO;
import basic.demo.po.UserRolePO;

import java.util.List;
import java.util.Map;

/**
 * 这里也是接口 interface 和dao不同的是, 这里是用来处理逻辑的, 所以里面有一个impl(实现)
 */
public interface IUserService {

    int save(UserPO userPO);

    List<UserPO> listUser();

    List<UserRolePO> getUserRoleInfos(Map params);

    List<UserInfoPO> getUserInfos(Map params);
}
