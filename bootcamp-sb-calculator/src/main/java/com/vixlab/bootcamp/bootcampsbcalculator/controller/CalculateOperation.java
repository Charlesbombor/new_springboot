package com.vixlab.bootcamp.bootcampsbcalculator.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.vixlab.bootcamp.bootcampsbcalculator.infra.InvalidInputException;
import com.vixlab.bootcamp.bootcampsbcalculator.result.Result;

public interface CalculateOperation {

  @GetMapping(value = "/x/{x}/y/{y}/operation/{operation}")
String operation(@PathVariable (name = "x")String x,  //
@PathVariable (name = "y")double y, @PathVariable(name = "operation") String operation) throws InvalidInputException;

//  @GetMapping(value = "/cat/{idx}")
//   Cat getCat(@PathVariable(name = "idx") int index);

//   @GetMapping(value = "/cats")
//   List<Cat> getCats();

//   @GetMapping(value = "/cat")
//   Cat getCat2(@RequestParam(name = "idx") int index);


  
}
