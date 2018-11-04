package basic.demo.service.impl;


import basic.demo.dao.IUserRoleDAO;
import basic.demo.po.UserRolePO;
import basic.demo.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
public class UserRoleServiceImpl implements IUserRoleService {

    @Autowired
    private IUserRoleDAO userRoleDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param userRolePO
     * @return
     */
    @Override
    public int save(UserRolePO userRolePO) {
        return userRoleDAO.save(userRolePO);
    }

    @Override
    public List<UserRolePO> listUserRole() {
        return userRoleDAO.listUserRole();
    }
}
