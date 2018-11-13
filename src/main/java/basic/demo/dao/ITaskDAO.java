package basic.demo.dao;


import basic.demo.po.TaskDTO;
import basic.demo.po.TaskPO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

//定义接口ITaskDAO
public interface ITaskDAO {

//定义返回值为int型的save方法,TaskPO为参数类型,taskPO为参数名字
    int save(TaskPO taskPO);
//定义返回类型为list的listTask方法,参数类型为TaskDTO,参数名为taskDTO
    List<TaskPO> listTask(TaskDTO taskDTO);
}
