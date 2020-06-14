package com.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yutang
 * @version V1.0
 * @Package com.config.client.comcenterclient
 * @date 2020/5/30 9:52
 * @desc 获取配置服务配置
 */
@RestController
@ResponseBody
@RefreshScope
public class MyFristConfigController {

    @Value("${hello}")
    private String hello ;

    @RequestMapping(value="/getHello", method= RequestMethod.GET)
    public String getHello() {
        return hello ;
    }
}
