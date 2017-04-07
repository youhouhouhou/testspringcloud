package com.test.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by zhuzhujier on 17-2-9.
 */
@SpringBootApplication
@EnableEurekaClient
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);
  }
}
