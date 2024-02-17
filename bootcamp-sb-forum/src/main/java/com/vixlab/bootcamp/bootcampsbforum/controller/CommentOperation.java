package com.vixlab.bootcamp.bootcampsbforum.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Comment;

public interface CommentOperation {
  
  @GetMapping(value = "/comments")
  List<Comment> getComment();
}
