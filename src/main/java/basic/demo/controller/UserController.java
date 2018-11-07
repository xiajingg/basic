package basic.demo.controller;

import basic.demo.po.UserDTO;
import basic.demo.po.UserPO;
import basic.demo.service.IUserService;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 这里命名规范 最后加上 Controller
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 这里就是关联 web 页面了, 先去看一下resources下面的application.yml
     * 当项目启动后 在网页输入 localhost:8080/listuser 就能进入 user页面
     * localhost 是本地id
     * 8080 是application.yml定义的端口号
     * listuser 是 下面GetMapping 定义的 path(路径)
     * 最后 return new ModelAndView("/user");  他回去 resources文件夹下的 templates文件夹下 去找一个 user 的ftl文件(其实就是html文件)
     * 看完后去 WebApplication
     * @param map
     * @return
     */
    @GetMapping(value = "listuser")
    public ModelAndView listUser(Map map){
        List<UserPO> userPOS=userService.listUser(new UserDTO());
        map.put("userPOS",userPOS);
        return new ModelAndView("/user");
    }

    @GetMapping(value = "login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @PostMapping(value = "dologin")
    public Map dologin(@RequestParam(value = "userCode")String userCode,@RequestParam(value = "userPwd")String userPwd){
        Map map = new HashMap();
        // shiro认证
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userCode, userPwd);
        try {
            subject.login(token);
        } catch (Exception e) {
            map.put("code","false");
            return map;
        }
        String res = subject.getPrincipals().toString();
        if (subject.hasRole("admin")) {
            res = res + "----------你拥有admin权限";
        }
        if (subject.hasRole("guest")) {
            res = res + "----------你拥有guest权限";
        }
//        reJson.setData(res);
        map.put("code","false");
        return map;
    }
}
