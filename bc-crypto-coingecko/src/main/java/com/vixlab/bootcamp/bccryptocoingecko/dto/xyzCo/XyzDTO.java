package com.vixlab.bootcamp.bccryptocoingecko.dto.xyzCo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class XyzDTO {

  private String id;
  private String symbol;
  private String name;
  private String image;


}
