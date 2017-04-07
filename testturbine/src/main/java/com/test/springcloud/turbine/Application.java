package com.test.springcloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by zhuzhujier on 17-2-10.
 */
@SpringBootApplication
@EnableTurbine
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);
  }
}
