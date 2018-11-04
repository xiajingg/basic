package basic.demo.service.impl;

import basic.demo.dao.IUserInfoDAO;
import basic.demo.po.UserInfoPO;
import basic.demo.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDAO userInfoDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param userInfoPO
     * @return
     */
    @Override
    public int save(UserInfoPO userInfoPO) {
        return userInfoDAO.save(userInfoPO);
    }

    @Override
    public List<UserInfoPO> listUserInfo() {
        return userInfoDAO.listUserInfo();
    }
}
