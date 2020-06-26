package com.xiao.nacos.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 09:22
 * @Description 获取配置中心值
 **/
@Slf4j
@RestController
public class NacosConfigController {


    /**
     * 使用 nacos 配置属性值获取，自动刷新
     */
    @NacosValue(value = "${config.test.name}", autoRefreshed = true)
    private String name;


    /**
     * 通过spring这种获取值方式，不能做到动态刷新
     */
    @Value("${config.test.name}")
    private String name2;


    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public String get() {

        log.info("get value, name:{}, spring-name:{}", name, name2);

        return name + ":" + name2;
    }

}
