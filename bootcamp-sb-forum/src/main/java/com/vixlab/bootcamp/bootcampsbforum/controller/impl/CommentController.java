package com.vixlab.bootcamp.bootcampsbforum.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vixlab.bootcamp.bootcampsbforum.controller.CommentOperation;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Comment;
import com.vixlab.bootcamp.bootcampsbforum.service.CommentService;


@RestController
@RequestMapping(value = "/api/v1")
public class CommentController implements CommentOperation {
  
@Autowired
private CommentService commentService;

@Override
public List<Comment> getComment() {
 return commentService.getComment();
}



}
