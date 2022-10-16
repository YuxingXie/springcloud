## springCloud学习

根据尚硅谷的springCloud视频教程编写而来，视频的地址为：

https://www.youtube.com/playlist?list=PLmOn9nNkQxJGVG1ktTV4SedFWuyef_Pi0

本仓库中包含这些视频，如果侵权了可以联系我删掉。

有些简单章节没有深究，毕竟入门为先。


### 1. [前置工作](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/001.MD)

本学习项目中我做了几个尝试：

1. 从maven转至gradle;

2. 使用h2database而非mysql;

3. 使用spring-data-jpa而非spring-data-mybatis。

学前提示：springCloud很多时候是配置和环境出错，所以请留意。

这一章是搭建过程。
  
#### 1.1 [新建工程](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/001.MD)  

，我将按照视频搭建一个project和它的若干subproject。



#### 1.2. [支付模块构建](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/002.MD)

对应视频8-11小节。

这一章用gradle和spring-data-jpa重构了作者的maven+spring-data-mabatis组件，所以durid什么的都用不上。

通过对比，我认为jpa的优越性超过mybatis大约一百万亿倍吧。

另外gradle构建的灵活性，可编程序，相比maven,强大约五十万亿倍吧。

postman，idea的热部署也不细研究了。

#### 1.3. [消费者订单模块](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/003.MD)

对应视频12-14小节。

这一章构建了消费者订单模块，知识点主要是restTemplate。

重构的时候gradle与maven，jpa与mybatis产生了巨大的差异。

通过对比，jpa的优越性超过mybatis一百万亿倍，gradle比maven强大约五十万亿倍。

### 2. [Eureka](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/004.MD)

现在正式进入springCloud生态了，贴个图先

![](https://github.com/YuxingXie/springcloud/raw/master/assets/images/001.jpg)

知识点：

* 分布式CAP理论

* 集群的概念

* 掌握如何配置集群

* 服务发现，自我保护

### 3. [zookeeper](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/005.MD)

因为以学习为主，所以服务注册中心eureka,zookeeper,consul先搞懂eureka，其它的有时间再学。
所以先掠过，章节保留。

### 4. [consul](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/006.MD)

### 5. [Ribbon](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/007.MD)

对应视频36-42 。

比较简单，知道它是做服务调用、负载均衡的，并知道有哪些负载均衡策略，掌握LoadBalancer接口实现自定义负载均衡即可。

所以简单快速看一遍视频，不深入先。

### 6. [OpenFeign](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/008.MD)

这一章较简单，为快速学习，不做代码研究，但还是要了解一些基本概念和操作。

OpenFeign可理解为Ribbon+RestTemplate的综合组件。以前80调用8001时，80是通过restTemplate访问8001的url或服务名实现的，
OpenFeign将其抽象为了接口。实现也很容易，interface注册为bean并增加@FeignClient注解。所以现在微服务之间的调用
从http直接调用方式变成了接口访问的方式，但底层实质还是http访问。

服务层(service)访问数据访问层(dao)也可以用OpenFeign实现。

超时控制与日志增强也快速浏览一遍。

* 超时设置：
```properties
ribbon.ReadTimeout=5000
ribbon.ConnectTimeout=5000
```
* 日志增强：

feign.Logger.Lever的bean

logger.level.xxxxx.xxxx.xxxxx.XxxService=debug


### 7. [Hystrix断路器](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/009.MD)

听说这章很重要，不摸鱼认真搞。

概念：

* 降级
* 熔断
