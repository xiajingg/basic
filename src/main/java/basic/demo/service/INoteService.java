package basic.demo.service;

import basic.demo.po.NoteDTO;
import basic.demo.po.NotePO;

import java.util.List;

/**
 * 这里也是接口 interface 和dao不同的是, 这里是用来处理逻辑的, 所以里面有一个impl(实现)
 */
public interface INoteService {

    int save(NotePO notePO);
//这个到底是 user还是note  note 那你interface这边写 user, impl那边又写note
    List<NotePO> listNote(NoteDTO noteDTO);
}
