package com.xiao.nacos;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author sunjinwei
 * @Date 2020-06-26 09:30
 * @Description 学习使用 Nacos 配置中心
 * dataId 默认等于应用名，不需要加扩展名，和 nacos 中完全相等即可
 * groupId、type 只能在这配置，在 yml 配置中不起作用
 **/
@SpringBootApplication
@NacosPropertySource(dataId = "nacos-config", groupId = "NACOS_PRD_GROUP", type = ConfigType.YAML, autoRefreshed = true)
public class NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
    }

}
