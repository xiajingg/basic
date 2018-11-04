package basic.demo.controller;

import basic.demo.po.QuestionPO;
import basic.demo.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * 这里命名规范 最后加上 Controller
 */
@RestController
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    /**
     * 这里就是关联 web 页面了, 先去看一下resources下面的application.yml
     * 当项目启动后 在网页输入 localhost:8080/listuser 就能进入 user页面
     * localhost 是本地id
     * 8080 是application.yml定义的端口号
     * listuser 是 下面GetMapping 定义的 path(路径)
     * 最后 return new ModelAndView("/user");  他回去 resources文件夹下的 templates文件夹下 去找一个 user 的ftl文件(其实就是html文件)
     * 看完后去 WebApplication
     * @param map
     * @return
     */
    @GetMapping(value = "listquestion")
    public ModelAndView listQuestion(Map map){
        List<QuestionPO> questionPOS=questionService.listQuestion();
        map.put("questionPOS",questionPOS);
        return new ModelAndView("/question");
    }
}
