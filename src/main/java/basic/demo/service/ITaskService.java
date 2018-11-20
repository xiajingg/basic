package basic.demo.service;


import basic.demo.po.TaskDTO;
import basic.demo.po.TaskPO;

import java.util.List;

/**
 * 这里也是接口 interface 和dao不同的是, 这里是用来处理逻辑的, 所以里面有一个impl(实现)
 */

public interface ITaskService {


    //定义返回值为int型的save方法,TaskPO为参数类型,taskPO为参数名字
    int save(TaskPO taskPO);
    //定义返回类型为list的listTask方法,参数类型为TaskDTO,参数名为taskDTO
    List<TaskPO> listTask(TaskDTO taskDTO);
}
