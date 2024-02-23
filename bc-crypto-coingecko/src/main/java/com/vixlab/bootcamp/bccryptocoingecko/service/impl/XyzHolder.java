package com.vixlab.bootcamp.bccryptocoingecko.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vixlab.bootcamp.bccryptocoingecko.dto.xyzCo.XyzDTO;
import com.vixlab.bootcamp.bccryptocoingecko.mapper.Mapper;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;
import com.vixlab.bootcamp.bccryptocoingecko.service.CoinService;
import com.vixlab.bootcamp.bccryptocoingecko.service.XyzService;

@Service
public class XyzHolder implements XyzService {

  @Autowired
  private CoinService coinService;

  @Autowired
  private Mapper mapper;

  @Override
  public List<XyzDTO> getCoins() {
    List<Coin> coins = coinService.getCoins();
    List<XyzDTO> xyzDTOs = new ArrayList<>();
    for (Coin coin : coins) {
      XyzDTO xyzDTO = mapper.map(coin);
      xyzDTOs.add(xyzDTO);
    }

    return xyzDTOs;
  }



}


