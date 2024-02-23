package com.vixlab.bootcamp.bccryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.vixlab.bootcamp.bccryptocoingecko.dto.xyzCo.XyzDTO;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;

public interface XyzOperation {
  
   @GetMapping(value = "/xyzcoins")
  List<XyzDTO> getCoins();
}
