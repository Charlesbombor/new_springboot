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
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.Post;
import com.vixlab.bootcamp.bootcampsbforum.service.PostService;


@Service
public class PostJsonPlaceHolder implements PostService{

  @Value(value = "${api.jph.domain}")
  private String domain;

  @Value(value = "${api.jph.endpoints.post}")
  private String postEndpoint;




    @Override
  public List<Post> getPost() {
    RestTemplate restTemplate2 = new RestTemplate();
    String postUrl = BcUtil.url(Scheme.HTTPS, domain, postEndpoint);
    Post[] post = restTemplate2.getForObject(postUrl, Post[].class);

    return Arrays.stream(post).collect(Collectors.toList());
  }

  // private static String url(Scheme scheme, String domain, String endpoint) {
  //   return UriComponentsBuilder.newInstance() //
  //       .scheme(scheme.lowercaseName()) // .scheme("https")
  //       .host(domain) //
  //       .path(endpoint) //
  //       .toUriString(); // handle special character, such as : / \
  // }

  @Override
  public Post getPost(int userId) {
return this.getPost().stream() //
 .filter(e -> e.getId() == userId)
 
 .get();
  }

  // return this.getUsers().stream()//
  // .filter(e -> e.getId() == userID)//
  // .findFirst()//
  // .get();
  
}
