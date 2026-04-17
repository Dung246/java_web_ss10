package org.example.project_base_spring_mvc.service;


import org.example.project_base_spring_mvc.model.TaskItem;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GetService {
    public List<TaskItem> getTaskItems() {

        return List.of();
    }
}
