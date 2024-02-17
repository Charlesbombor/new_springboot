package com.vixlab.bootcamp.bootcampsbcalculator.Service.impl;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import com.vixlab.bootcamp.bootcampsbcalculator.Service.CalculateService;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.InvalidInputException;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.Syscode;
import com.vixlab.bootcamp.bootcampsbcalculator.result.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
// import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;



@Service
public class CalculateServiceImpl implements CalculateService {

  @Override
  public String operation(String x, double y, String operation)
      throws InvalidInputException {

   
    double ans = 0.0d;
    switch (operation) {
      case "add":
        ans = Double.parseDouble(x) + y;
        break;

      case "sub":
        ans = Double.parseDouble(x) - y;
        break;

      case "mul":
        ans = Double.parseDouble(x) * y;
        break;

      case "div":
        ans = Double.parseDouble(x) / y;
        break;
    }

    Result result = new Result(x, String.valueOf(y), operation,
        String.valueOf(ans));
    ObjectMapper mapper = new ObjectMapper();
    ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
    String jsonResponse = "";
    try {
      jsonResponse = writer.writeValueAsString(result);
    } catch (JsonProcessingException e) {
      
      e.printStackTrace();
    }
    return jsonResponse;

  }





}


