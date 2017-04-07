package com.test.springcloud.customer.controller;

import com.test.springcloud.customer.feign.UserFeignClient;
import com.test.springcloud.customer.model.User;
import com.test.springcloud.customer.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuzhujier on 17-2-9.
 */
@RestController
public class UserFeignController {

  @Autowired
  UserFeignClient userFeignClient;

  @Autowired
  UserService userService;

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id){
    return userFeignClient.findById(id);
  }

  @GetMapping("/rest/{id}")
  public User findByIdRest(@PathVariable Long id){
    return userService.findById(id);
  }

}
