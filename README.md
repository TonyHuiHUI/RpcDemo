# RpcDemo

# Dapeng-hello
以 [dapeng-soa](https://github.com/dapeng-soa/dapeng-soa) 构建的hello服务(Java实现)

## 项目目录树
```
|--dapeng-hello
|  |--hello-api                 dapeng服务api，插件生成代码
|  |  |--src
|  |  |  |--main
|  |  |  |  |--java
|  |  |  |  |--resources
|  |  |  |  |  |--thrifts       IDL文件存放
|  |  |--pom.xml
|  |--hello-service             dapeng服务实现
|  |  |--src
|  |  |  |--main
|  |  |  |  |--java
|  |  |  |  |--resources
|  |  |  |  |  |--META-INF
|  |  |  |  |  |  |--spring
|  |  |  |  |  |  |  |--services.xml
|  |  |  |  |  |  |--services
|  |  |  |  |  |  |  |--com.github.dapeng.core.ApplicationContext   SpringBoot启动类
|  |  |--pom.xml
|  |  |--logs
|  |  |--docker
|  |  |  |--Dockerfile          
|  |--.gitignore
|  |--pom.xml
|  |--hello-test         客户端测试
------------------------------------
```
## 本地启动
本地启动需要本地启动 zookeeper ,可使用 docker 启动一个 zookeeper 容器
```bash
docker pull zookeeper
docker run --name zookeeper -p 2181:2181 --restart always -d zookeeper
```
## Dapeng 插件启动服务

```bash
cd hello-service
mvn compile dapeng:run
或者
cd hello-service
mvn clean compile com.github.dapeng-soa:dapeng-maven-plugin:2.1.2-SNAPSHOT:run -Dsoa.freq.limit.enable=false -Dsoa.apidoc.port=8192
指定运行参数 (zk地址,容器ip)
-Dmaven.test.skip=true -Dsoa.zookeeper.host=192.168.4.111:2181 -Dhost.ip=192.168.4.111 -Dfile.encoding=utf-8  -Dsoa.transactional.enable=false

```
> 注意:这里指定`-Dsoa.apidoc.port=8192`，为文档站点端口,浏览器打开http://localhost:8192即可访问

打开浏览器 http://localhost:8192 访问在线文档进行测试

## 打包docker镜像

```bash
cd hello-service
mvn clean package
```

## 使用docker-compose编排服务
使用docker-compose启动服务容器
```bash
docker-compose up -d helloZk
docker-compose up -d helloService
```
以上命令会一并启动一个依赖的 zookeeper 容器 helloZk ,无需单独启动 zookeeper

> 容器模式下启动服务没有在线测试站点,如果需要测试可以编写客户端服务来进行测试