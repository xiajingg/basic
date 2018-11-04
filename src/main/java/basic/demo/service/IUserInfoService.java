package basic.demo.service;

import basic.demo.po.UserInfoPO;


import java.util.List;

/**
 * 这里也是接口 interface 和dao不同的是, 这里是用来处理逻辑的, 所以里面有一个impl(实现)
 */
public interface IUserInfoService {

    int save(UserInfoPO userInfoPO);

    List<UserInfoPO> listUserInfo();
}
