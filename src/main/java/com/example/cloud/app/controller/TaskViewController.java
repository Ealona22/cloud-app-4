package com.example.cloud.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskViewController {

    // This method will return the form to create a task
    @GetMapping("/tasks/create")
    public String showCreateTaskForm() {
        return "task-create"; 
    }
    
    // This method will return the page to list tasks
    @GetMapping("/tasks/list")
    public String showTaskList() {
        return "task-list"; 
    }
}
