package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code){
        log.info("进入auth");
        log.info("code={}",code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?" +
                "appid=wxdd78d0335010c758&secret=e1320089b53604151db462dfb8094957&code="+code+"&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForObject(url,String.class);
        log.info("response:{}",json);
    }
}
