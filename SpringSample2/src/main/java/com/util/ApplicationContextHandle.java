package com.util;

import org.springframework.beans.BeansException;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.ApplicationContextAware;  
  
/** 
 * 在容器启动后,也可以通过 getBean(String name) 得到对象 
 * @author Administrator 
 * <!-- 需要在spring.xml 里写 --> 
 * <bean class="com.abc.framework.util.ApplicationContextHandle" lazy-init="false"/> 
 */  
public class ApplicationContextHandle implements ApplicationContextAware{  
    private static ApplicationContext applicationContext;  
      
    @Override  
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {  
        ApplicationContextHandle.applicationContext = applicationContext;  
    }  
  
    /**  
     * 获取对象  
     * 这里重写了bean方法，起主要作用  
     * @param name  
     * @return Object 一个以所给名字注册的bean的实例  
     * @throws BeansException  
     */    
    public static Object getBean(String name) throws BeansException {  
        return applicationContext.getBean(name);    
    }  
}  