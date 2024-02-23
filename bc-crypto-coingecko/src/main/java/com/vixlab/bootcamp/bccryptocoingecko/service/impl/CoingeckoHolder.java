package com.vixlab.bootcamp.bccryptocoingecko.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.vixlab.bootcamp.bccryptocoingecko.infra.ApiResponse;
import com.vixlab.bootcamp.bccryptocoingecko.infra.CoinUtil;
import com.vixlab.bootcamp.bccryptocoingecko.infra.NullPointer;
import com.vixlab.bootcamp.bccryptocoingecko.infra.ResourceNotFound;
import com.vixlab.bootcamp.bccryptocoingecko.infra.Syscode;
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
  @Override
  public List<Coin> getCoinsById(String[] idsArray) {
  List<Coin> allCoins = getCoins();
  List<Coin> filteredCoins = allCoins.stream()
  .filter(coin -> Arrays.asList(idsArray).contains(coin.getId()))
  .collect(Collectors.toList());

return filteredCoins;
  }

  @Override
  public Coin getCoinsById2(String ids) {

    if(ids == null)
    throw new NullPointer(Syscode.NPE_EXCEPTION);

    Optional<Coin> filteredCoins = this.getCoins().stream() //
      .filter(coin -> coin.getId() == ids) //
      .findFirst();

      if(filteredCoins.isPresent())
      return filteredCoins.get();
      throw new ResourceNotFound(Syscode.NOTFOUND);
  }

}


