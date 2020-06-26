package com.xiao.service1.service;

import com.xiao.service1api.service.Service1Consumer;
import com.xiao.service2api.serivice.Service2Provider;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 17:18
 * @Description 服务1的消费者
 **/
@org.apache.dubbo.config.annotation.Service
@Slf4j
public class Service1ConsumerImpl implements Service1Consumer {


    /**
     * 使用 dubbo 协议进行接口间调用
     */
    @Reference
    private Service2Provider service2Provider;

    @Override
    public String getConsumer() {

        log.info("服务消费者");

        String provider = service2Provider.getProvider();

        return "consumer" + ":" + provider;
    }

}
