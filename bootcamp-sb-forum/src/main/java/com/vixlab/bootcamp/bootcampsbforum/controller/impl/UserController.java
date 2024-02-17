package com.vixlab.bootcamp.bootcampsbforum.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.vixlab.bootcamp.bootcampsbforum.controller.UserOperation;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.User;
import com.vixlab.bootcamp.bootcampsbforum.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(value = "/api/v1")
public class UserController implements UserOperation {


  
  @Autowired
private UserService userService;

  @Override
  public List<User> getUsers() {
   return userService.getUsers();
  }



  
}
