package basic.demo.dao;

import basic.demo.po.NoteDTO;
import basic.demo.po.NotePO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INoteDAO {


    int save(NotePO notePO);

    List<NotePO> listNote(NoteDTO noteDTO);
}
