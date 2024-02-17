package com.vixlab.springboot.demobootcampsbhelloworld.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vixlab.springboot.demobootcampsbhelloworld.model.Cat;

@Controller // Web Layer, provide the capability of API (application programming interface)
@ResponseBody // JSON (Format of data transmission - System A call System B API)
@RequestMapping(value = "/api/v1") // base path of URI: Version 1
public class HelloworldController {
  
  // NO attributes, constructor, 
  // Have instance mehtod

  @GetMapping(value = "/hello") // endpoint
  public String helloworld() {
    return "Welcome to Spring Boot.";
  }

  @GetMapping(value = "/primitive")
  public int primitive() {
    return 13;
  }

  @GetMapping(value = "/wrapperclass")
  public Character wrapperClass() {
    return 'C';
  }

  @GetMapping(value = "/wrapperclass2")
  public Double doubleWrapper() {
    return Double.valueOf(13.2d);
  }

  @GetMapping(value = "/cat")
  public Cat getCat(){
    return Cat.builder() // 
      .name("ABC") //
      .age(1) //
      .build();
  }

  @GetMapping(value = "/cat2")
  public Cat getCat2(){
    return new Cat("Mau", 2);
  }

  @GetMapping(value = "/catList")
  public List<Cat> getCat3(){
    List<Cat> cat = new ArrayList();
    cat.add(new Cat("Apa", 1));
    cat.add(new Cat("Bana", 2));
    cat.add(new Cat("Choco", 3));
    return cat;
  }

  @GetMapping(value = "/cats")
  public List<Cat> getCats(){
    return Stream.of(new Cat("ABC", 2), new Cat("DEF", 3)) //
      .collect(Collectors.toList());
  }

  @GetMapping(value = "/catArray")
  public Cat[] getArray(){
    return new Cat[] {new Cat("ABC", 2), new Cat("DEF", 3)};
  }







  }




