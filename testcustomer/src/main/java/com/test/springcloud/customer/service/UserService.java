package com.test.springcloud.customer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.springcloud.customer.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhuzhujier on 17-2-9.
 */
@Service
public class UserService {

  @Autowired
  RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "")
  public User findById(Long id){
    return  restTemplate.getForObject("http://microservice-provider-user/"+id,User.class);
  }

}
