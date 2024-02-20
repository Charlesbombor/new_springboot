package com.vixlab.bootcamp.bccryptocoingecko.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vixlab.bootcamp.bccryptocoingecko.controller.CoinOperation;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;
import com.vixlab.bootcamp.bccryptocoingecko.service.CoinService;


@RestController
@RequestMapping (value = "/crypto/coingecko/api/v1")
public class CoinController implements CoinOperation {

  @Autowired
  private CoinService coinService;


  @Override
  public List<Coin> getCoins() {
   return coinService.getCoins();
  }


  @Override
  public List<Coin> getCoinsById(String ids) {
    String[] idsArray = ids.split(",");
    List<Coin> coins = coinService.getCoinsById(idsArray);
    return coins;
  }
  
}
