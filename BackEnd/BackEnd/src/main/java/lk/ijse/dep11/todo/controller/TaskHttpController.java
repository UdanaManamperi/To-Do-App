package lk.ijse.dep11.todo.controller;

import lk.ijse.dep11.todo.to.TaskTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/tasks")
public class TaskHttpController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public TaskTO createTask(){
        System.out.println("This is createTask");
        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping
    public void updateTask(){
        System.out.println("This is updateTask");

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void deleteTask(){
        System.out.println("This is deleteTask");

    }

    @GetMapping
    public List<TaskTO> getAllTasks(){
        System.out.println("This is getAllTasks");
        return null;
    }



}
