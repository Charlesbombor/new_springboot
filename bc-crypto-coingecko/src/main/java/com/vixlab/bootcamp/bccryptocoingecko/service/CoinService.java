package com.vixlab.bootcamp.bccryptocoingecko.service;

import java.util.List;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;


public  interface CoinService {
  List<Coin> getCoins();

 List<Coin> getCoinsById(String[] idsArray);

 Coin getCoinsById2(String ids);

}
