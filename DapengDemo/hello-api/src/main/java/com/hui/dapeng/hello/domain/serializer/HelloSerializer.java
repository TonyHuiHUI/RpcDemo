 package com.hui.dapeng.hello.domain.serializer;
        import com.hui.dapeng.hello.domain.serializer.*;

        import com.github.dapeng.core.*;
        import com.github.dapeng.org.apache.thrift.*;
        import com.github.dapeng.org.apache.thrift.protocol.*;

        import java.util.Optional;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.Future;

        /**
        * Autogenerated by Dapeng-Code-Generator (2.1.2-SNAPSHOT)
        *
        * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
        *
        **/
        public class HelloSerializer implements BeanSerializer<com.hui.dapeng.hello.domain.Hello>{
        
      @Override
      public com.hui.dapeng.hello.domain.Hello read(TProtocol iprot) throws TException{

      com.hui.dapeng.hello.domain.Hello bean = new com.hui.dapeng.hello.domain.Hello();
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
            
              case 2:
              if(schemeField.type == com.github.dapeng.org.apache.thrift.protocol.TType.STRING){
              String elem0 = iprot.readString();
       bean.setMessage(Optional.of(elem0));
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
      public void write(com.hui.dapeng.hello.domain.Hello bean, TProtocol oprot) throws TException{

      validate(bean);
      oprot.writeStructBegin(new com.github.dapeng.org.apache.thrift.protocol.TStruct("Hello"));

      
            oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("name", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 1));
            String elem0 = bean.getName();
            oprot.writeString(elem0);
            
            oprot.writeFieldEnd();
          if(bean.getMessage().isPresent()){
              oprot.writeFieldBegin(new com.github.dapeng.org.apache.thrift.protocol.TField("message", com.github.dapeng.org.apache.thrift.protocol.TType.STRING, (short) 2));
              String elem1 = bean.getMessage().get();
              oprot.writeString(elem1);
              
            }
            
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
      public void validate(com.hui.dapeng.hello.domain.Hello bean) throws TException{
      
              if(bean.getName() == null)
              throw new SoaException(SoaCode.StructFieldNull, "name?????????????????????");
            
    }
    
        @Override
        public String toString(com.hui.dapeng.hello.domain.Hello bean)
        {return bean == null ? "null" : bean.toString();}
      }
      

      