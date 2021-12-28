package com.whoami.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/hello")
    public String test(Model model){
        model.addAttribute("msg","第一个springmvc");
        return "test";
    }

    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        model.addAttribute("msg","我是"+name);
        return "test";
    }

    @GetMapping("/t2/{id}")
    public String test3(@PathVariable("id") Integer id,Model model){
        model.addAttribute("msg","我是"+id);
        return "test";
    }

}
