package com.vixlab.bootcamp.bootcampsbforum.service;

import java.util.List;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Post;

public interface PostService {
  
List<Post> getPost();

List<Post> getPost(int userId);

}
