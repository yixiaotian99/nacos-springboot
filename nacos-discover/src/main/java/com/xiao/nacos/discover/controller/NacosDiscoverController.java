package com.xiao.nacos.discover.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 14:11
 * @Description 使用 nacos 服务注册发现
 **/
@Slf4j
@RestController
public class NacosDiscoverController {


    /**
     * 注入 nacos
     */
    @NacosInjected
    private NamingService namingService;


    @GetMapping("get")
    public List<Instance> getInstance(@RequestParam String serviceName) throws NacosException {

        log.info("查询服务的所有实例, serverName:{}", serviceName);

        List<Instance> instanceList = namingService.getAllInstances(serviceName);

        return instanceList;
    }

}
