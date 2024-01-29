package database.service.impl;

import database.model.Cat;

public interface CatDatabaseService {

  Cat getCatFromStaticMemory(int index);

  void setCatToStaticMemory (int index, Cat cat);

}
