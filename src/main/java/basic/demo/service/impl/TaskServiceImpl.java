package basic.demo.service.impl;


import basic.demo.dao.INoteDAO;
import basic.demo.dao.ITaskDAO;
import basic.demo.po.NoteDTO;
import basic.demo.po.NotePO;
import basic.demo.po.TaskDTO;
import basic.demo.po.TaskPO;
import basic.demo.service.INoteService;
import basic.demo.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  implements 实现这个接口, 写逻辑(为什么这样写 后续再说)
 *
 */
@Service
//定义一个实现ITaskService接口的业务类TaskServiceImpl
public class TaskServiceImpl implements ITaskService {

    @Autowired
    //定义类名为taskDAO的ITaskDAO类
    private ITaskDAO taskDAO;

    /**
     * 这两个方法后续再说
     * 看完到controller
     * @param taskPO
     * @return
     */
    @Override
    //调用taskDAO类的save方法,参数名为taskPO,然后把返回值放到当前的save方法里
    public int save(TaskPO taskPO) {
        return taskDAO.save(taskPO);
    }

    @Override
    //调用taskDAO类的listTask方法,将返回值放到当前定义的listTask方法里,最后显示的形式是list
    public List<TaskPO> listTask(TaskDTO taskDTO) {
        return taskDAO.listTask(taskDTO);
    }
}
