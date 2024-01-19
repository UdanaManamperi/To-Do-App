package lk.ijse.dep11.todo.controller;

import lk.ijse.dep11.todo.to.TaskTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/tasks")
public class TaskHttpController {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = "application/json",consumes = "application/json")
    public TaskTO createTask(@RequestBody @Validated TaskTO task){
        System.out.println("This is createTask");
        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping(value = "/{id}", consumes = "application/json")
    public void updateTask(){
        System.out.println("This is updateTask");

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") int taskId){
        System.out.println("This is deleteTask");

    }

    @GetMapping(produces = "application/json", params = {"email"})
    public List<TaskTO> getAllTasks(String email){
        System.out.println("This is getAllTasks");
        return null;
    }



}
