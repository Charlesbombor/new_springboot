package com.vixlab.bootcamp.bccryptocoingecko.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vixlab.bootcamp.bccryptocoingecko.controller.XyzOperation;
import com.vixlab.bootcamp.bccryptocoingecko.dto.xyzCo.XyzDTO;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;
import com.vixlab.bootcamp.bccryptocoingecko.service.XyzService;

@RestController
@RequestMapping (value = "/xyz/api/v1")
public class XyzController implements XyzOperation {

  @Autowired
  private XyzService xyzService;

  @Override
  public List<XyzDTO> getCoins() {
    return xyzService.getCoins();
  
  }
  
}
