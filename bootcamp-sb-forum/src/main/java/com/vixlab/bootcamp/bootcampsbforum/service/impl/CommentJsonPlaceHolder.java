package com.vixlab.bootcamp.bootcampsbforum.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.vixlab.bootcamp.bootcampsbforum.infra.BcUtil;
import com.vixlab.bootcamp.bootcampsbforum.infra.Scheme;
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Comment;
import com.vixlab.bootcamp.bootcampsbforum.service.CommentService;


@Service
public class CommentJsonPlaceHolder implements CommentService {

  @Value(value = "${api.jph.domain}")
  private String domain;

  @Value(value = "${api.jph.endpoints.comment}")
  private String commentEndpoint;

  @Override
  public List<Comment> getComment() {
    RestTemplate restTemplate3 = new RestTemplate();
    String commentUrl = BcUtil.url(Scheme.HTTPS, domain, commentEndpoint);
    Comment[] comment = restTemplate3.getForObject(commentUrl, Comment[].class);

    return Arrays.stream(comment).collect(Collectors.toList());
  }

  //  private static String url(Scheme scheme, String domain, String endpoint) {
  //   return UriComponentsBuilder.newInstance() //
  //       .scheme(scheme.lowercaseName()) // .scheme("https")
  //       .host(domain) //
  //       .path(endpoint) //
  //       .toUriString(); // handle special character, such as : / \
  // }


  
}
