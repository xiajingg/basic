package basic.demo.service.impl;


import basic.demo.dao.IRoleInfoDAO;
import basic.demo.po.RoleInfoPO;
import basic.demo.service.IRoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
public class RoleInfoServiceImpl implements IRoleInfoService {

    @Autowired
    private IRoleInfoDAO roleInfoDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param roleInfoPO
     * @return
     */
    @Override
    public int save(RoleInfoPO roleInfoPO) {
        return roleInfoDAO.save(roleInfoPO);
    }

    @Override
    public List<RoleInfoPO> listRoleInfo() {
        return roleInfoDAO.listRoleInfo();
    }
}
