package com.vixlab.bootcamp.demosbfakedatabase.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import database.model.Cat;

public interface DatabaseOperation {

  // 2 ways to define variable from the URI
  // 1. PathVariable
  @GetMapping (value = "/cat/{idx}")
    Cat getCat(@PathVariable(name = "idx") int index );

    @GetMapping (value = "/cat/index/{index}/name/{name}/age/{age}")
    Cat setCat(@PathVariable int index, @PathVariable String name, @PathVariable int age );
}
