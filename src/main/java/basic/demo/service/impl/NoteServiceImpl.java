package basic.demo.service.impl;


import basic.demo.dao.INoteDAO;
import basic.demo.po.NoteDTO;
import basic.demo.po.NotePO;
import basic.demo.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
public class NoteServiceImpl implements INoteService {

    @Autowired
    private INoteDAO noteDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param notePO
     * @return
     */
    @Override
    public int save(NotePO notePO) {
        return noteDAO.save(notePO);
    }

    @Override
    public List<NotePO> listNote(NoteDTO noteDTO) {
        return noteDAO.listNote(noteDTO);
    }
}
