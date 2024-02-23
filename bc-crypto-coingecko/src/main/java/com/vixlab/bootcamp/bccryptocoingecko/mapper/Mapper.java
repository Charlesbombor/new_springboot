package com.vixlab.bootcamp.bccryptocoingecko.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import com.vixlab.bootcamp.bccryptocoingecko.dto.xyzCo.XyzDTO;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;


@Component
public class Mapper {
  
  @Autowired
  private ModelMapper modelMapper;
 

  public XyzDTO map (Coin coin){
    return this.modelMapper.map(coin, XyzDTO.class);
  }
}
