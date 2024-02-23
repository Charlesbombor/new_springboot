package com.vixlab.bootcamp.bccryptocoingecko.service;

import java.util.List;
import com.vixlab.bootcamp.bccryptocoingecko.dto.xyzCo.XyzDTO;


public interface XyzService {
  
  List<XyzDTO> getCoins();
}
