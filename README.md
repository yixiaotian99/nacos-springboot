# nacos-springboot
使用阿里 nacos 配置及服务发现


               PC
               |                      http
            gateway
               |                      feign
               |
            application-1
               |                      dubbo
        _______|_______
       |               |
       |               |         
    server-1 ------> server-2         dubbo
    
    
```
1. pc 通过  http 调用 gateway 
2. gateway 通过 feign 调用 application-1
3. applicaion-1 通过 dubbo 协议调用 server-1、server-2
4. server-1 通过 dubbo 调用 server-2

其中， 
server1-api、server2-api 是方便用于 RPC 调用，只存储接口的模块
server-1、server-2 是接口实现
```