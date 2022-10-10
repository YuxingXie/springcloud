## springCloud学习

根据尚硅谷的springCloud视频教程编写而来，视频的地址为：

https://www.youtube.com/playlist?list=PLmOn9nNkQxJGVG1ktTV4SedFWuyef_Pi0

但是做了几个尝试：

1. 从maven转至gradle;

2. 使用h2database而非mysql;

3. 使用spring-data-jpa而非spring-data-mybatis。

学前提示：springCloud很多时候是配置和环境出错，所以请留意。

### 1. [新建工程](https://github.com/YuxingXie/springcloud/blob/master/1.%E6%96%B0%E5%BB%BA%E5%B7%A5%E7%A8%8B.MD)  

在这一章，我将视频教学中的maven构建工具改为了gradle。

### 2. [支付模块构建](https://github.com/YuxingXie/springcloud/blob/master/2.%E6%94%AF%E4%BB%98%E6%A8%A1%E5%9D%97%E6%9E%84%E5%BB%BA.MD)

这一章用gradle和spring-data-jpa重构了作者的maven+spring-data-mabatis组件，所以durid什么的都用不上。

通过对比，我认为jpa的优越性超过mybatis大约一百万亿倍吧。

另外gradle构建的灵活性，可编程序，相比maven,强大约五十万亿倍吧。

postman，idea的热部署也不细讲了。