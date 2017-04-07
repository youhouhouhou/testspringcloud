package com.test.springcloud.customer;

import com.netflix.hystrix.metric.sample.HystrixUtilizationStream;

import feign.Feign;
import feign.Logger;
import feign.httpclient.ApacheHttpClient;
import feign.hystrix.HystrixFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import rx.Subscriber;
import rx.Subscription;
import rx.schedulers.Schedulers;


/**
 * Created by zhuzhujier on 17-2-9.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class Application {

  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);
  }


  @Bean
  @LoadBalanced
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean
  Logger.Level level() {
    return Logger.Level.BASIC;
  }

  @Bean
  Feign.Builder feignBuilder() {

    return HystrixFeign.builder().client(new ApacheHttpClient());
  }


}
