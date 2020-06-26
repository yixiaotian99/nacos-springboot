package com.xiao.service2api.serivice;

/**
 * @Author sunjinwei
 * @Date 2020-06-26 17:29
 * @Description 服务消费者
 **/
public interface Service2Provider {

    /**
     * 向外暴露 dubbo 接口
     *
     * @return
     */
    String getProvider();
}
