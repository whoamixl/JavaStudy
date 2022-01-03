package com.example.emal.controller;


import com.example.emal.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;
    @GetMapping("/send")
    public String test(){
        emailService.test();
        String from = emailService.simpleMailMessage.getFrom();
        return "已经发送给："+from;
    }
}
