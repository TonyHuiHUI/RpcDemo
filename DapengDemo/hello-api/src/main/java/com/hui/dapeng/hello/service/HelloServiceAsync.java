
        package com.hui.dapeng.hello.service;

        import com.github.dapeng.core.Processor;
        import com.github.dapeng.core.Service;
        import com.github.dapeng.core.SoaGlobalTransactional;

        import java.util.concurrent.Future;

        /**
         * Autogenerated by Dapeng-Code-Generator (2.1.2-SNAPSHOT)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING

        * 

 Hello-Service

        **/
        @com.github.dapeng.core.CustomConfig()
        @Service(name="com.hui.dapeng.hello.service.HelloService",version = "1.0.0")
        @Processor(className = "com.hui.dapeng.hello.HelloServiceAsyncCodec$Processor")
        public interface HelloServiceAsync  extends com.github.dapeng.core.definition.AsyncService {
        
            /**
            * 

# sayHello
## 业务描述
    sayHello
## 接口依赖
    无
## 边界异常说明
    无
## 输入
    hello
## 前置检查
    无
## 权限检查
    无
## 逻辑处理
    sayHello
## 数据库变更
    无
## 事务处理
    无
## 输出
    string
## 事件
    无

            **/
            
            
              
              Future<String> sayHello( String name) throws com.github.dapeng.core.SoaException;
            
          
            /**
            * 

# sayHello
## 业务描述
    sayHello
## 接口依赖
    无
## 边界异常说明
    无
## 输入
    hello
## 前置检查
    无
## 权限检查
    无
## 逻辑处理
    sayHello
## 数据库变更
    无
## 事务处理
    无
## 输出
    string
## 事件
    无

            **/
            
            
              
              Future<String> sayHello2( com.hui.dapeng.hello.domain.Hello hello) throws com.github.dapeng.core.SoaException;
            
          
      }
      