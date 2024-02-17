package com.vtxlab.bootcamp.bootcampsbforum.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.bootcampsbforum.controller.GovOperation;
import com.vtxlab.bootcamp.bootcampsbforum.dto.gov.UserPostDTO;
import com.vtxlab.bootcamp.bootcampsbforum.dto.gov.mapper.GovMapper;
import com.vtxlab.bootcamp.bootcampsbforum.model.dto.jph.Post;
import com.vtxlab.bootcamp.bootcampsbforum.service.PostService;
import com.vtxlab.bootcamp.bootcampsbforum.service.UserService;

@RestController
@RequestMapping(value = "/gov/api/v1")
public class GovController implements GovOperation {

  @Autowired
  private UserService userService;

  @Autowired
  private PostService postService;

  @Override
  public UserPostDTO getUser(int userId) {
    // 1. User Service
    // 2. Post Service
    // 3. relate the user and post
    // 4. set DTO object and return
    return userService.getUsers().stream() //
        .filter(e -> e.getId() == userId) //
        .map(e -> {
          List<Post> posts = postService.getPosts();
          return GovMapper.map(e, posts);
        }).findFirst() //
        .orElseGet(null); // http code: 204 -> no content

  }

}


  

