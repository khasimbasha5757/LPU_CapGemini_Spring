package com.capgemini.todoList.service;



import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.web.multipart.MultipartFile;




public interface TaskService {

    List<Task> getAllTasks();

    void saveTask(Task task, MultipartFile file);

    void toggleStatus(Long id);

    void deleteTask(Long id);

    Task getTask(Long id);
}