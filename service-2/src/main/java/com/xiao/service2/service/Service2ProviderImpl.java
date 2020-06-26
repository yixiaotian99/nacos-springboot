package com.xiao.service2.service;


import com.xiao.service2api.serivice.Service2Provider;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 17:20
 * @Description 服务提供者 使用阿里的 @service
 **/
@org.apache.dubbo.config.annotation.Service
@Slf4j
public class Service2ProviderImpl implements Service2Provider {


    @Override
    public String getProvider() {

        log.info("服务提供者");

        return "provider";
    }

}
