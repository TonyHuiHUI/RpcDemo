
        package com.hui.dapeng.hello;
        import com.hui.dapeng.hello.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.1.2-SNAPSHOT)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class HelloServiceSuperCodec {
        
            //1. method_args
            public static class sayHello_args {
            
                private String name;
                public String getName(){
                return this.name;
              }
                public void setName(String name){
                this.name = name;
              }
              

          }

            //2. method_result
            public static class sayHello_result {
            
                  private String success;
                  public String getSuccess(){
                  return success;
                }

                  public void setSuccess(String success){
                  this.success = success;
                }
                

          }

           //3. args_serializer
            public static class SayHello_argsSerializer implements BeanSerializer<sayHello_args>{
            
      @Override
      public sayHello_args read(TProtocol iprot) throws TException{

      sayHello_args bean = new sayHello_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setName(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(sayHello_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("sayHello_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("name", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getName();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(sayHello_args bean) throws TException{
      
              if(bean.getName() == null)
              throw new SoaException(SoaCode.StructFieldNull, "name?????????????????????");
            
    }
    

            @Override
            public String toString(sayHello_args bean) { return bean == null ? "null" : bean.toString(); }
          }


            //4.ResultSerializer
            public static class SayHello_resultSerializer implements BeanSerializer<sayHello_result>{
            @Override
            public sayHello_result read(TProtocol iprot) throws TException{

              sayHello_result bean = new sayHello_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
                    String elem0 = iprot.readString();
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(sayHello_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("sayHello_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            String elem0 = bean.getSuccess();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(sayHello_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.StructFieldNull, "success?????????????????????");
            
    }
    

            @Override
            public String toString(sayHello_result bean) { return bean == null ? "null" : bean.toString(); }
          }

          
            //1. method_args
            public static class sayHello2_args {
            
                private com.hui.dapeng.hello.domain.Hello hello;
                public com.hui.dapeng.hello.domain.Hello getHello(){
                return this.hello;
              }
                public void setHello(com.hui.dapeng.hello.domain.Hello hello){
                this.hello = hello;
              }
              

          }

            //2. method_result
            public static class sayHello2_result {
            
                  private String success;
                  public String getSuccess(){
                  return success;
                }

                  public void setSuccess(String success){
                  this.success = success;
                }
                

          }

           //3. args_serializer
            public static class SayHello2_argsSerializer implements BeanSerializer<sayHello2_args>{
            
      @Override
      public sayHello2_args read(TProtocol iprot) throws TException{

      sayHello2_args bean = new sayHello2_args();
      com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();

      while(true){
        schemeField = iprot.readFieldBegin();
        if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

        switch(schemeField.id){
          
              case 1:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT){
              com.hui.dapeng.hello.domain.Hello elem0 = new com.hui.dapeng.hello.domain.Hello();
        elem0=new com.hui.dapeng.hello.domain.serializer.HelloSerializer().read(iprot);
       bean.setHello(elem0);
            }else{
              com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
              break;
            
          
            default:
            com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      validate(bean);
      return bean;
    }
    
      @Override
      public void write(sayHello2_args bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("sayHello2_args"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("hello", com.github.dapeng.org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            com.hui.dapeng.hello.domain.Hello elem0 = bean.getHello();
             new com.hui.dapeng.hello.domain.serializer.HelloSerializer().write(elem0, oprot);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(sayHello2_args bean) throws TException{
      
              if(bean.getHello() == null)
              throw new SoaException(SoaCode.StructFieldNull, "hello?????????????????????");
            
                if(bean.getHello() != null)
                new com.hui.dapeng.hello.domain.serializer.HelloSerializer().validate(bean.getHello());
              
    }
    

            @Override
            public String toString(sayHello2_args bean) { return bean == null ? "null" : bean.toString(); }
          }


            //4.ResultSerializer
            public static class SayHello2_resultSerializer implements BeanSerializer<sayHello2_result>{
            @Override
            public sayHello2_result read(TProtocol iprot) throws TException{

              sayHello2_result bean = new sayHello2_result();
              com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
              iprot.readStructBegin();

              while(true){
                schemeField = iprot.readFieldBegin();
                if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP){ break;}

                switch(schemeField.id){
                  case 0:  //SUCCESS
                  if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
                    String elem0 = iprot.readString();
       bean.setSuccess(elem0);
                  }else{
                    com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                  }
                  break;
                  /*
                  case 1: //ERROR
                  bean.setSoaException(new SoaException());
                  new SoaExceptionSerializer().read(bean.getSoaException(),iprot);
                  break A;
                  */
                  default:
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
              }
              iprot.readStructEnd();

              validate(bean);
              return bean;
            }
            
      @Override
      public void write(sayHello2_result bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("sayHello2_result"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            String elem0 = bean.getSuccess();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
            
      public void validate(sayHello2_result bean) throws TException{
      
              if(bean.getSuccess() == null)
              throw new SoaException(SoaCode.StructFieldNull, "success?????????????????????");
            
    }
    

            @Override
            public String toString(sayHello2_result bean) { return bean == null ? "null" : bean.toString(); }
          }

          

        //5.

        //6. meta_args
        public static class getServiceMetadata_args {}

        //7. meta_result.
        public static class getServiceMetadata_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }
        }

        //8. args_serializer
        public static class GetServiceMetadata_argsSerializer implements BeanSerializer<getServiceMetadata_args> {

          @Override
          public getServiceMetadata_args read(TProtocol iprot) throws TException {

            getServiceMetadata_args bean =new getServiceMetadata_args();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_args bean) throws TException {}

          @Override
          public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        //9. meta_resultSerializer
        public static class GetServiceMetadata_resultSerializer implements BeanSerializer<getServiceMetadata_result> {
          @Override
          public getServiceMetadata_result read(TProtocol iprot) throws TException {

            getServiceMetadata_result bean = new getServiceMetadata_result();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(getServiceMetadata_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaCode.StructFieldNull, "success?????????????????????");
          }

          @Override
          public String toString(getServiceMetadata_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        //10. echo_args
        public static class echo_args {}

        //11. echo_result.
        public static class echo_result {

          private String success;

          public String getSuccess() {
            return success;
          }

          public void setSuccess(String success) {
            this.success = success;
          }
        }

        //12. echo_argsSerializer
        public static class echo_argsSerializer implements BeanSerializer<echo_args> {

          @Override
          public echo_args read(TProtocol iprot) throws TException {

            echo_args bean =new echo_args();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }
              switch (schemeField.id) {
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(echo_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("echo_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(echo_args bean) throws TException {}

          @Override
          public String toString(echo_args bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

        //13. echo_resultSerializer
        public static class echo_resultSerializer implements BeanSerializer<echo_result> {
          @Override
          public echo_result read(TProtocol iprot) throws TException {

            echo_result bean = new echo_result();
            com.github.dapeng.org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
              schemeField = iprot.readFieldBegin();
              if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STOP) {
                break;
              }

              switch (schemeField.id) {
                case 0:  //SUCCESS
                if (schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING) {
                  bean.setSuccess(iprot.readString());
                } else {
                  com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                break;
                default:
                com.github.dapeng.org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
            return bean;
          }

          @Override
          public void write(echo_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("echo_result"));

            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("success", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 0));
            oprot.writeString(bean.getSuccess());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
          }

          public void validate(echo_result bean) throws TException {

            if (bean.getSuccess() == null)
            throw new SoaException(SoaCode.RespFieldNull, "success?????????????????????");
          }

          @Override
          public String toString(echo_result bean) {
            return bean == null ? "null" : bean.toString();
          }
        }

       }
      