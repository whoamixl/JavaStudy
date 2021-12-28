package com.whoami.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyControllerFilter {
    @GetMapping("/f1")
    public String test1(@RequestParam("test") String name, Model model){
        model.addAttribute("msg",name);
        return "test";

    }
}
