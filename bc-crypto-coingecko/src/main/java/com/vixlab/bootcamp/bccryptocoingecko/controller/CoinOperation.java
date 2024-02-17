package com.vixlab.bootcamp.bccryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;



public interface CoinOperation {
  
  @GetMapping(value = "/coins")
  List<Coin> getCoins();
}
