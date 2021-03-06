package com.hui.dapeng.hello;
        import com.hui.dapeng.hello.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import com.github.dapeng.core.definition.SoaServiceDefinition;
        import com.github.dapeng.core.definition.SoaFunctionDefinition;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;
        import com.hui.dapeng.hello.HelloServiceSuperCodec.*;

        import com.hui.dapeng.hello.service.HelloServiceAsync;
        /**
        * Autogenerated by Dapeng-Code-Generator (2.1.2-SNAPSHOT)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class HelloServiceAsyncCodec {

        

            public static class sayHello<I extends com.hui.dapeng.hello.service.HelloServiceAsync> extends SoaFunctionDefinition.Async<I, sayHello_args, sayHello_result>
            {
              public sayHello()
              {
                super("sayHello", new SayHello_argsSerializer(),  new SayHello_resultSerializer());
              }

              @Override
              public CompletableFuture<sayHello_result> apply(HelloServiceAsync iface, sayHello_args sayHello_args) throws SoaException
              {
                CompletableFuture<String> result = (CompletableFuture<String>) iface.sayHello(sayHello_args.getName());
                return result.thenApply(( String i) -> {
                  sayHello_result res = new sayHello_result();
                  res.setSuccess(i);
                  return res;
              });
              }

            }
          

            public static class sayHello2<I extends com.hui.dapeng.hello.service.HelloServiceAsync> extends SoaFunctionDefinition.Async<I, sayHello2_args, sayHello2_result>
            {
              public sayHello2()
              {
                super("sayHello2", new SayHello2_argsSerializer(),  new SayHello2_resultSerializer());
              }

              @Override
              public CompletableFuture<sayHello2_result> apply(HelloServiceAsync iface, sayHello2_args sayHello2_args) throws SoaException
              {
                CompletableFuture<String> result = (CompletableFuture<String>) iface.sayHello2(sayHello2_args.getHello());
                return result.thenApply(( String i) -> {
                  sayHello2_result res = new sayHello2_result();
                  res.setSuccess(i);
                  return res;
              });
              }

            }
          

        public static class getServiceMetadata<I extends com.hui.dapeng.hello.service.HelloServiceAsync> extends SoaFunctionDefinition.Async<I, getServiceMetadata_args, getServiceMetadata_result> {
          public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
          }

          @Override
          public CompletableFuture<getServiceMetadata_result> apply(I iface, getServiceMetadata_args args) {
            getServiceMetadata_result result = new getServiceMetadata_result();

            //fake async method, to avoid using the JDK default ForkJoinPool.common, which will case heap-off OOM
            CompletableFuture<getServiceMetadata_result> resultFuture = new CompletableFuture<>();

            try (InputStreamReader isr = new InputStreamReader(HelloServiceCodec.class.getClassLoader().getResourceAsStream("com.hui.dapeng.hello.service.HelloService.xml"));
            BufferedReader in = new BufferedReader(isr)) {
              int len = 0;
              StringBuilder str = new StringBuilder("");
              String line;
              while ((line = in.readLine()) != null) {

                if (len != 0) {
                  str.append("\r\n").append(line);
                } else {
                  str.append(line);
                }
                len++;
              }
              result.setSuccess(str.toString());
            } catch (Exception e) {
              e.printStackTrace();
              result.setSuccess("");
            }
            resultFuture.complete(result);
            return resultFuture;
          }

        }

        public static class echo<I extends com.hui.dapeng.hello.service.HelloServiceAsync> extends SoaFunctionDefinition.Async<I, echo_args, echo_result> {
          public echo() {
            super("echo", new echo_argsSerializer(), new echo_resultSerializer());
          }

          @Override
          public CompletableFuture<echo_result> apply(I iface, echo_args args) {
            echo_result result = new echo_result();
            CompletableFuture<echo_result> resultFuture = new CompletableFuture<>();

            String echoMsg = (String) TransactionContext.Factory.currentInstance().getAttribute("container-threadPool-info");
            result.setSuccess(echoMsg);
            //result.setSuccess("PONG");
            resultFuture.complete(result);
            return resultFuture;
          }

        }




        @SuppressWarnings("unchecked")
        public static class Processor<I extends com.hui.dapeng.hello.service.HelloServiceAsync> extends SoaServiceDefinition<com.hui.dapeng.hello.service.HelloServiceAsync>
        {

          public Processor(com.hui.dapeng.hello.service.HelloServiceAsync iface, Class<com.hui.dapeng.hello.service.HelloServiceAsync> ifaceClass)
          {
            super(iface, ifaceClass, buildMap(new java.util.HashMap<>()));
          }

          @SuppressWarnings("unchecked")
          private static <I extends com.hui.dapeng.hello.service.HelloServiceAsync> java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> buildMap(java.util.Map<String, SoaFunctionDefinition<I, ?, ?>> processMap)
          {
            
                processMap.put("sayHello", new sayHello());
              
                processMap.put("sayHello2", new sayHello2());
              
            processMap.put("getServiceMetadata", new getServiceMetadata());
            processMap.put("echo", new echo());
            return processMap;
          }
        }

      }
      