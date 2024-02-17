package com.vixlab.bootcamp.bccryptocoingecko.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vixlab.bootcamp.bccryptocoingecko.infra.CoinUtil;
import com.vixlab.bootcamp.bccryptocoingecko.model.Coin;
import com.vixlab.bootcamp.bccryptocoingecko.service.CoinService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CoingeckoHolder implements CoinService{

  @Value("${api.cgk.key}")
  private String key ;

  @Value(value = "${api.cgk.domain}")
  private String domain;

  @Value(value = "${api.cgk.path.endpoint}")
  private String coinEndpoint;

  @Value("${api.cgk.path.currency}")
  private String currency;

  private String url =  "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&x_cg_demo_api_key=CG-GKPDT69yYkZ7UP69mTP3tRCR";
	@Override
	public List<Coin> getCoins() {
		RestTemplate restTemplate = new RestTemplate();
    String coinUrl = CoinUtil.url("https", domain, coinEndpoint,currency,key);
    log.info("coinUrl " +coinUrl);
    Coin[] coins = restTemplate.getForObject(url, Coin[].class);

    return Arrays.stream(coins) //
      .collect(Collectors.toList());

	}

  
}
