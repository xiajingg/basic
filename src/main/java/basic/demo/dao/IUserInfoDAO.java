package basic.demo.dao;

import basic.demo.po.UserInfoPO;


import java.util.List;

/**
 * dao是接口层, 接口只定义规范,不定义怎样实现,所以下面没有写内容, 并且在20行定义的时候是interface(接口) 不是 class
 * 命名规范 开头大写I 最后大写DAO结尾, 每个方法只能做一件事情
 * 比如 save增加 listUser查询所有user表的数据
 * 去看application.yml下的 8 9 10行 url username password
 * url jdbc:mysql://localhost:3306/demo?autoReconnect=true&failOverReadOnly=false&useUnicode=true&characterEncoding=utf-8&useSSL=false
 *                  本机地址, 默认端口3306 /demo自己定义的数据库名  ?后面都不变
 *                  username: 数据库登录名 一般是 root
 *                  password 登录密码  其他先不变
 * save方法要保存 所以你要给他保存的东西, 括号里面就是他需要的东西(叫做 形参)
 * listUser查询所有 不需要形参 但是数据库会返回给你查询的所有东西, 所以前面有个List<UserPO> 接收返回值
 * 看完就去resources文件夹下的 mapper文件下的 UserMapper
 */
public interface IUserInfoDAO {

    /**
     *  int 返回值  save方法名  (UserPO userPO)你需要传给他的东西
     * @param userInfoPO
     * @return
     */
    int save(UserInfoPO userInfoPO);

    List<UserInfoPO> listUserInfo();
}
