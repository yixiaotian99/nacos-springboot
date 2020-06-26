package com.xiao.application1.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 09:22
 * @Description 获取配置中心值，必须使用  @RefreshScope 注解，否则 spring 值不会动态刷新
 **/
@Slf4j
@RefreshScope
@RestController
public class NacosConfigController {


    /**
     * 使用 nacos 配置属性值获取，自动刷新
     * 只有当引用是 nacos-config-spring-boot-starter 时才生效
     * 当引用是  spring-cloud-starter-alibaba-nacos-config 取不到值
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
