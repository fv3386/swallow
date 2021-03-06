package com.dianping.swallow.common.producer.exceptions;

/**
 * 远程调用服务初始化失败（pigeon初始化失败）时，抛出该异常，可能的原因为网络异常或配置错误
 * 
 * @author tong.song
 */
public class RemoteServiceInitFailedException extends Exception {
   private static final long serialVersionUID = 8096198828080692568L;

   public RemoteServiceInitFailedException(String message, Throwable cause) {
      super(message, cause);
   }

   public RemoteServiceInitFailedException(Throwable cause) {
      super("Remote service initial failed.", cause);
   }
}
