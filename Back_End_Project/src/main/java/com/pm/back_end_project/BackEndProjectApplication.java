package com.pm.back_end_project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackEndProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndProjectApplication.class, args);
    }

    @Bean
    public ModelMapper ModelMapper(){
        return new ModelMapper();
    }
}
