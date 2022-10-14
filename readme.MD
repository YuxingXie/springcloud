## springCloud学习

根据尚硅谷的springCloud视频教程编写而来，视频的地址为：

https://www.youtube.com/playlist?list=PLmOn9nNkQxJGVG1ktTV4SedFWuyef_Pi0

本仓库中包含这些视频，如果侵权了可以联系我删掉。

本项目中我做了几个尝试：

1. 从maven转至gradle;

2. 使用h2database而非mysql;

3. 使用spring-data-jpa而非spring-data-mybatis。

学前提示：springCloud很多时候是配置和环境出错，所以请留意。

### 1. [新建工程](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/001.MD)  

在这一章，我将视频教学中的maven构建工具改为了gradle。

### 2. [支付模块构建](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/002.MD)

对应视频8-11小节。

这一章用gradle和spring-data-jpa重构了作者的maven+spring-data-mabatis组件，所以durid什么的都用不上。

通过对比，我认为jpa的优越性超过mybatis大约一百万亿倍吧。

另外gradle构建的灵活性，可编程序，相比maven,强大约五十万亿倍吧。

postman，idea的热部署也不细研究了。

### 3. [消费者订单模块](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/003.MD)

对应视频12-14小节。

这一章构建了消费者订单模块，知识点主要是restTemplate。

重构的时候gradle与maven，jpa与mybatis产生了巨大的差异。

通过对比，jpa的优越性超过mybatis一百万亿倍，gradle比maven强大约五十万亿倍。

### 4. [Eureka](https://github.com/YuxingXie/springcloud/blob/master/assets/mds/004.MD)

现在正式进入springCloud生态了，贴个图先

![](https://github.com/YuxingXie/springcloud/raw/master/assets/images/001.jpg)

知识点：

* 分布式CAP理论
