/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author zhamingd
 */
public class DynamicProxyHandler implements InvocationHandler{
    private Object subject;
    
    public DynamicProxyHandler(Object subject)
    {
        this.subject = subject;
    }
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    if(null == args) {
      return null;
    }
    System.out.println("before function call. Method = " + method + ", arguments = " + args.toString());
    
    Object ret = method.invoke(subject,args);
    System.out.println("After function called.");
    return ret;
  }
  
}
