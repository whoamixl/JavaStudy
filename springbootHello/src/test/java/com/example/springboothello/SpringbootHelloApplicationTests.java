package com.example.springboothello;

import com.example.springboothello.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootHelloApplicationTests {

    @Autowired
    private Student student;
    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
