package basic.demo.controller;

import basic.demo.po.*;
import basic.demo.service.INoteService;
import basic.demo.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class TaskController {

    @Autowired
//    私有    类名         定义的名称
    private ITaskService taskService;

    /**
     * 这里就是关联 web 页面了, 先去看一下resources下面的application.yml
     * 当项目启动后 在网页输入 localhost:8080/listtask就能进入 task页面
     * localhost 是本地id
     * 8080 是application.yml定义的端口号
     * listtask 是 下面GetMapping 定义的 path(路径)
     * 最后 return new ModelAndView("/task");  他回去 resources文件夹下的 templates文件夹下 去找一个 task 的ftl文件(其实就是html文件)
     * 看完后去 WebApplication
     *
     * @param map
     * @return
     */
    //定义路径名称
    @GetMapping(value = "listtask")
    //公有    返回值         方法名    参数
    public ModelAndView listTask(Map map) {
//定义返回类型为List<TaskPO>的,名称为taskPOS=调用service类的listTask方法
        List<TaskPO> taskPOS = taskService.listTask(new TaskDTO());
        //将储存的taskPOS放进map里.
        map.put("taskPOS", taskPOS);
        return new ModelAndView("/task");
    }

//定义路径名称
    @GetMapping(value = "createTask")
    //到templates文件夹下,找createTask的ftl文件
    public ModelAndView createTask(Map map) {
        return new ModelAndView("/createTask");
    }

    @PostMapping(value = "doCreateTask")
    public Map doCreateTask(TaskDTO taskDTO) {
        Map map = new HashMap();
        TaskPO taskPO = new TaskPO();
        taskPO.setId(UUIDHelper.getUUID32());
        taskPO.setUserid(taskDTO.getUserid());
        taskPO.setTaskContent(taskDTO.getTaskContent());
        taskPO.setPublishTime(taskDTO.getPublishTime());
        taskPO.setReid(taskDTO.getReid());
        taskPO.setVersionNum(taskDTO.getVersionNum());
        taskPO.setSubmitTime(taskDTO.getSubmitTime());
        taskPO.setAcptid(taskDTO.getAcptid());
        taskPO.setAcceptTime(taskDTO.getAcceptTime());

        taskService.save(taskPO);
        map.put("data", "ok");
        return map;

    }

    @GetMapping(value = "taskDetail")
    public ModelAndView taskDetail(Map map, @RequestParam(value = "id") String id) {
        TaskDTO taskDTO = new TaskDTO();
        taskDTO.setId(id);
        TaskPO taskPO = taskService.listTask(taskDTO).get(0);
        map.put("taskPO",taskPO);
        return new ModelAndView("/taskDetail");
    }
}
