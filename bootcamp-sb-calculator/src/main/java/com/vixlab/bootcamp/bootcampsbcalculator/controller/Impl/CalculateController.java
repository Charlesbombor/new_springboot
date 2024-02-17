package com.vixlab.bootcamp.bootcampsbcalculator.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vixlab.bootcamp.bootcampsbcalculator.Service.CalculateService;
import com.vixlab.bootcamp.bootcampsbcalculator.controller.CalculateOperation;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.InvalidInputException;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.Syscode;


@RestController
@RequestMapping(value = "/api/v1")

public class CalculateController implements CalculateOperation {

  @Autowired
  private CalculateService calculateService;

  @Override
  public String operation(String x, double y, String operation)
      throws InvalidInputException {

     try {
          double number = Double.parseDouble(x);
        } catch (NumberFormatException e) {
          throw new InvalidInputException(Syscode.INVAILD_INPUT);
        }


   return calculateService.operation(x, y, operation);
  }


    }
  

