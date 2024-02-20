package com.vixlab.bootcamp.bccryptocoingecko.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;



public interface CoinOperation {
  
  @GetMapping(value = "/coins")
  List<Coin> getCoins();

  @GetMapping(value = "/coins/ids")
  List<Coin> getCoinsById (
   @RequestParam (value = "ids") String ids);


   
}
