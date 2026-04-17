package org.example.project_base_spring_mvc.controller;


package com.example.controller;

import com.example.model.TaskItem;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {

    private List<TaskItem> tasks = new ArrayList<>();

    public TaskController() {
        tasks.add(new TaskItem("1", "Học Java cơ bản", LocalDate.now().plusDays(2), "HIGH"));
        tasks.add(new TaskItem("2", "Làm bài tập Spring MVC", LocalDate.now().plusDays(3), "MEDIUM"));
    }

    @GetMapping("/tasks")
    public String getAll(Model model) {
        model.addAttribute("tasks", tasks);
        return "task-list";
    }

    @GetMapping("/tasks/add")
    public String showForm(Model model) {
        model.addAttribute("task", new TaskItem());
        return "task-form";
    }

    @PostMapping("/tasks/add")
    public String addTask(
            @Valid @ModelAttribute("task") TaskItem task,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "task-form";
        }

        task.setId(String.valueOf(tasks.size() + 1));
        tasks.add(task);

        return "redirect:/tasks";
    }
}
