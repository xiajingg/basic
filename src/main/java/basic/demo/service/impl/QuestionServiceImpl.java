package basic.demo.service.impl;


import basic.demo.dao.IQuestionDAO;
import basic.demo.po.QuestionDTO;
import basic.demo.po.QuestionPO;
import basic.demo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private IQuestionDAO questionDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param questionPO
     * @return
     */
    @Override
    public int save(QuestionPO questionPO) {
                return questionDAO.save(questionPO);
    }

    @Override
    public List<QuestionPO> listQuestion(QuestionDTO questionDTO) {
        return questionDAO.listQuestion(questionDTO);
    }
}
