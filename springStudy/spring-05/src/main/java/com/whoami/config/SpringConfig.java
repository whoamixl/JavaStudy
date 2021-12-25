package com.whoami.config;


import com.whoami.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.crypto.interfaces.PBEKey;

@Configuration
@ComponentScan("com.whoami.pojo")
@Import(SpringConfig2.class)
public class SpringConfig {

    @Bean
    public User user(){
        return new User();
    }
}
