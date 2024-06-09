package com.mini_data_hub.mini_data_hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MiniDataHubApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(MiniDataHubApplication.class, args);
    }

}
