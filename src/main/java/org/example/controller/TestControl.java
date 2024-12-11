package org.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

    @Autowired
    private StudentService studentService;

    @GetMapping("/test")
    public String test() {
        return studentService.getBaseMapper().selectList(new LambdaQueryWrapper<>()).toString();
    }
}
