package com.vixlab.bootcamp.bootcampsbforum.service;

import java.util.List;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.User;



public interface UserService {

  List<User> getUsers();

  User getUser(int userID);
}
