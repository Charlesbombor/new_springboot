package com.vtxlab.bootcamp.bootcampsbfakedatabase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  
  @Bean(name = "tutor")
  public String tutorName(){
    return "Vincent";
  }
}
