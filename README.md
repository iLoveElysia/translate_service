translate.js 的后端服务，正在完善中，敬请期待.

# 线上部署
### 1. 购买服务器

* 核心：1核
* 内存：1G
* 区域：新加坡
* 操作系统：CentOS 7.4
* 系统盘：默认的系统盘就行。无需数据盘
* 弹性公网IP：按流量计费（带宽大小10MB）
* 其他的未注明的，都按照怎么省钱怎么来选即可。

**备注**  
1. 这里会有多个型号，比如什么s3、s6、t6的，你就选最便宜的就行。（一般t6是最便宜的，选它就行）  
1. 安全组：要开放22、80这两个端口


### 2. 一键安装
执行shell命令进行一键部署安装

````
wget https://gitee.com/mail_osc/translate_service/raw/master/install/install.sh -O install.sh && chmod -R 777 install.sh && sh ./install.sh
````
