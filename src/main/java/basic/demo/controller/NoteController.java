package basic.demo.controller;

import basic.demo.po.NoteDTO;
import basic.demo.po.NotePO;
import basic.demo.po.UUIDHelper;
import basic.demo.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 这里命名规范 最后加上 Controller
 */
@RestController
public class NoteController {

    @Autowired
    private INoteService noteService;

    /**
     * 这里就是关联 web 页面了, 先去看一下resources下面的application.yml
     * 当项目启动后 在网页输入 localhost:8080/listnote就能进入 user页面
     * localhost 是本地id
     * 8080 是application.yml定义的端口号
     * listuser 是 下面GetMapping 定义的 path(路径)
     * 最后 return new ModelAndView("/user");  他回去 resources文件夹下的 templates文件夹下 去找一个 user 的ftl文件(其实就是html文件)
     * 看完后去 WebApplication
     * @param map
     * @return
     */
    @GetMapping(value = "listnote")
    public ModelAndView listNote(Map map){
        List<NotePO> notePOS=noteService.listNote(new NoteDTO());
        map.put("notePOS",notePOS);
        return new ModelAndView("/note");
    }



    @GetMapping(value = "createNote")
    public ModelAndView createNote(Map map){
        return new ModelAndView("/createNote");
    }

    @PostMapping(value = "doCreateNote")
    public Map doCreateNote(NoteDTO noteDTO){
        Map map=new HashMap();
        NotePO notePO=new NotePO();
        notePO.setId(UUIDHelper.getUUID32());
        notePO.setTitle(noteDTO.getTitle());
        notePO.setTime(new Date());
        notePO.setUserid(noteDTO.getName());
        notePO.setText(noteDTO.getText());
        noteService.save(notePO);
        map.put("data","ok");
        return map;

    }

    @GetMapping(value = "noteDetail")
    public ModelAndView noteDetail(Map map, @RequestParam(value = "id")String id){
        NoteDTO noteDTO=new NoteDTO();
        noteDTO.setId(id);
        NotePO notePO=noteService.listNote(noteDTO).get(0);
        map.put("notePO",notePO);
        return new ModelAndView("/noteDetail");
    }
}
