package database.service;

import org.springframework.stereotype.Service;
import database.CatDatabase;
import database.model.Cat;
import database.service.impl.CatDatabaseService;

@Service
public class CatDatabaseServiceimpl implements CatDatabaseService {

  // Objective of Service
  // 1. Data source
  // 2. The service you are going to provide

  @Override
  public Cat getCatFromStaticMemory(int index) {
    return CatDatabase.getCat(index);
  }

  @Override
  public void setCatToStaticMemory(int index, Cat cat) {
    CatDatabase.setCat(index, cat);
}


}