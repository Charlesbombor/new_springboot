package com.vixlab.bootcamp.bootcampsbcalculator.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {

  private String x;
  private String y;
  private String operation;
  private String result;



}
