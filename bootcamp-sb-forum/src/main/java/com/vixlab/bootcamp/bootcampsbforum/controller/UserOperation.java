package com.vixlab.bootcamp.bootcampsbforum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.User;

public interface UserOperation {

  @GetMapping (value = "/users")
  List<User> getUsers();



}
