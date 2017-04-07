package com.test.springcloud.customer.feign;

import com.test.springcloud.customer.model.User;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhuzhujier on 17-2-9.
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

  @RequestMapping("/{id}")
  User findById(@RequestParam("id") Long id);
}
