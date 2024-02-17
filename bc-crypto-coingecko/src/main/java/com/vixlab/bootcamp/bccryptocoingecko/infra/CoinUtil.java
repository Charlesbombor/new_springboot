package com.vixlab.bootcamp.bccryptocoingecko.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class CoinUtil {

  public static String url(String scheme, String domain, String endpoint,
      String key, String currency) {
    return UriComponentsBuilder.newInstance() //
        .scheme("https") //
        .host(domain) //
        .pathSegment(endpoint.split("/")) //
        .queryParam("vs_currency", currency)//
        .queryParam("x_cg_demo_api_key", key)//
        .toUriString();

  }
}
