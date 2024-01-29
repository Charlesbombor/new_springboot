package com.vixlab.bootcamp.demosbfakedatabase.Controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vixlab.bootcamp.demosbfakedatabase.Controller.DatabaseOperation;
import database.model.Cat;
import database.service.CatDatabaseServiceimpl;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")

public class DatabaseController implements DatabaseOperation{


  @Override
  public Cat getCat(int index){
    return new CatDatabaseServiceimpl().getCatFromStaticMemory(index);
  }

  @Override
  public Cat setCat(int index, String name, int age){
    return new CatDatabaseServiceimpl().getCatFromStaticMemory(index);
  }
}
