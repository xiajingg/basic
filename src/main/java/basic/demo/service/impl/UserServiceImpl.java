package basic.demo.service.impl;


import basic.demo.dao.IUserDAO;
import basic.demo.po.UserPO;
import basic.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param userPO
     * @return
     */
    @Override
    public int save(UserPO userPO) {
        return userDAO.save(userPO);
    }

    @Override
    public List<UserPO> listUser() {
        return userDAO.listUser();
    }
}
