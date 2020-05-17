package com.mistra.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mistra.dubbo.api.UserService;
import com.mistra.dubbo.api.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ConsumerController {

    @Reference(version = "${mistra.service.version}")
    private UserService userService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return userService.welcome(name);
    }

    @RequestMapping("/getUserbyid/{id}")
    public User getUserByid(@PathVariable("id") String id){
        return userService.getUserByid(id);
    }

    @RequestMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
}
