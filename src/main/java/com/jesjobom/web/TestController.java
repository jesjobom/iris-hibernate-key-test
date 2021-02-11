package com.jesjobom.web;

import com.jesjobom.persistence.manager.TestManager;
import com.jesjobom.persistence.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestManager testManager;

    @PostMapping
    public Test create(@RequestParam(name = "name", defaultValue = "John Doe") String name) {
        return testManager.criar(name);
    }

    @GetMapping
    public List<Test> list() {
        return testManager.list();
    }

}
