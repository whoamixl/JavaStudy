package com.example.springboothello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {

    @Value("11")
    private int id;

    @Value("WHOAMI")
    private String name;

    @Value("1")
    private int sex;

    @Value("33")
    private int age;

    @Value("成都市环球中心")
    private String address;

    @Value("1")
    private int subjectId;

//    @Autowired
    private Dog dog;
}
