package com.SideProject.Progress.tracker.controller;

import com.SideProject.Progress.tracker.Repo.TaskRepository;
import com.SideProject.Progress.tracker.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskRepository taskRepository;

    @PostMapping("/task")
    public Task addTask(@RequestBody Task task){
        System.out.println(task);
        return taskRepository.save(task);

    }

    @GetMapping("/allTasks/{name}")
    public List<Task> getTask(@PathVariable("name") String name){
        return taskRepository.findByName(name);
    }
}
