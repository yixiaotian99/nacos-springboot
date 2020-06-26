package com.xiao.application1.controller;

import com.xiao.service1api.service.Service1Consumer;
import com.xiao.service2api.serivice.Service2Provider;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 17:36
 * @Description 测试生产者、消费者
 **/
@Slf4j
@RestController
public class ProviderConsumerController {


    /**
     * 使用 dubbo 协议引用
     */
    @Reference
    private Service1Consumer service1Consumer;

    @Reference
    private Service2Provider service2Provider;


    @GetMapping(value = "call")
    public String call() {

        log.info("生产者消费者调用");

        String provider = service2Provider.getProvider();

        String consumer = service1Consumer.getConsumer();

        String ret = provider + "|" + consumer;

        return ret;
    }

}
