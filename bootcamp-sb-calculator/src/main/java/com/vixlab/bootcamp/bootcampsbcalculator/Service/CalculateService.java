package com.vixlab.bootcamp.bootcampsbcalculator.Service;

import com.vixlab.bootcamp.bootcampsbcalculator.infra.InvalidInputException;

public interface CalculateService {

  //String add(double x, double y, String operation) throws Exception;

  String operation(String x, double y, String operation) throws InvalidInputException;

  // double subtract(double x, double y);

  // double multiply(double x, double y);

  // double divide(double x, double y);



}
