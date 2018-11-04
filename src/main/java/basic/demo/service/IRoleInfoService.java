package basic.demo.service;

import basic.demo.po.RoleInfoPO;


import java.util.List;

/**
 * 这里也是接口 interface 和dao不同的是, 这里是用来处理逻辑的, 所以里面有一个impl(实现)
 */
public interface IRoleInfoService {

    int save(RoleInfoPO roleInfoPO);

    List<RoleInfoPO> listRoleInfo();
}