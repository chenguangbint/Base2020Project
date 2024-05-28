package com.glgxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Chapter07Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter07Application.class, args);
        //使用BCryptPasswordEncoder加密密码
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordToEncode = "123456";
        String encodedPassword = passwordEncoder.encode(passwordToEncode);
        //每次运行得到的密码不一样，需要先存入数据库中，然后再登录！
        System.out.println("Encoded Password: " + encodedPassword);
    }

}
