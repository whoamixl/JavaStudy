package com.example.emal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;

@Service
public class EmailService{

        @Autowired
        private  JavaMailSender mailSender;

        public SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        public void test(){
                simpleMailMessage.setFrom("2387135321@qq.com");
                simpleMailMessage.setTo("2387135321@qq.com");
                simpleMailMessage.setText("我是whoami啊，我要测试springbootEmail");
                mailSender.send(simpleMailMessage);
        }


}
