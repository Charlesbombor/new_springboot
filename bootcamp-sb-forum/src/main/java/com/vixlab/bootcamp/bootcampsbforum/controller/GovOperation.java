package com.vtxlab.bootcamp.bootcampsbforum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.vtxlab.bootcamp.bootcampsbforum.dto.gov.UserPostDTO;

public interface GovOperation {

  @GetMapping(value = "/users")
  UserPostDTO getUser(@RequestParam(value = "id") int userId);

  // 404 -> request path issue or resource not found
  // 204 -> id not found. Processed the business logic, record not found 
}

