package com.example.springboothello.controller;


import com.alibaba.fastjson.JSON;
import com.example.springboothello.pojo.Dog;
import com.example.springboothello.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @RequestMapping("/hello")
    public String test(){
        Dog dog = new Dog();
        Student student = new Student(11, "小龙", 1, 32, "成都市金牛区", 2,dog);
        String s = JSON.toJSONString(student);
        return s;
//        return "ssss";
    }
}
