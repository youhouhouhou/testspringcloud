package provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import provider.entity.User;
import provider.repos.UserRepository;

/**
 * Created by zhuzhujier on 17-2-9.
 */
@RestController
public class UserController {


  @Autowired
  private UserRepository userRepository;

  /**
   * 注:@GetMapping("/{id}")是spring	4.3的新注解等价于:
   *
   * @return user信息
   * @RequestMapping(value="/id",method=RequestMethod.GET) 类似的注解还有@PostMapping等等
   * @paramid
   */
  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User findOne = this.userRepository.findOne(id);
    return findOne;
  }



}
