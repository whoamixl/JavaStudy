package com.example.emal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmalApplication.class, args);
    }

}
