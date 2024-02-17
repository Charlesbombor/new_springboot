package com.vixlab.bootcamp.bootcampsbforum.service;

import java.util.List;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Comment;


public interface CommentService {
  
  List<Comment> getComment();
}
