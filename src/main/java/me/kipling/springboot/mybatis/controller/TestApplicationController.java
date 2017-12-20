package me.kipling.springboot.mybatis.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.kipling.springboot.mybatis.common.util.SpringUtil3;

@RestController
@RequestMapping("/application")
public class TestApplicationController {
    
    @RequestMapping("/test1")
    public Object testSpringUtil1() {
        return SpringUtil3.getBean("testDemo");
    }
    
}