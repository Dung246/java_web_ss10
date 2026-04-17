package org.example.project_base_spring_mvc.controller;


import org.example.project_base_spring_mvc.model.TaskItem;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {
    List<TaskItem> taskItems = new ArrayList<>();
    public List<TaskItem> getTaskItems() {

        return taskItems;
    }
    public void setTaskItems(List<TaskItem > taskItems){
        this.taskItems=taskItems;
    }

}
