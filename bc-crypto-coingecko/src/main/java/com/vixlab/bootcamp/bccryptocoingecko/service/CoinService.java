package com.vixlab.bootcamp.bccryptocoingecko.service;

import java.util.List;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;


public  interface CoinService {
  List<Coin> getCoins();
}
