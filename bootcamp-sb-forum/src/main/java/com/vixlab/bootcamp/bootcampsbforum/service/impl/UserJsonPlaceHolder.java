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
import com.vixlab.bootcamp.bootcampsbforum.model.dto.jph.User;
import com.vixlab.bootcamp.bootcampsbforum.service.UserService;

@Service
public class UserJsonPlaceHolder implements UserService {

  @Value(value = "${api.jph.domain}")
  private String domain;

  @Value(value = "${api.jph.endpoints.user}")
  private String userEndpoint;

  @Override
  public List<User> getUsers() {
    RestTemplate restTemplate = new RestTemplate();
    String userUrl = BcUtil.url(Scheme.HTTPS, domain, userEndpoint);
    User[] users = restTemplate.getForObject(userUrl, User[].class);

    return Arrays.stream(users).collect(Collectors.toList());
  }

  @Override
  public User getUser(int userID) {
    
  return this.getUsers().stream()//
        .filter(e -> e.getId() == userID)//
        .findFirst()//
        .get();
}


}


