/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import com.md.test.DynamicProxyHandler;
import com.md.test.RealSubject;
import com.md.test.Subject;
import java.lang.reflect.Proxy;

/**
 *
 * @author zhamingd
 */
public class DynamicMethodImpl {
  public static void main(String[] args) {
    Subject subject = new RealSubject();
    System.out.println("real's hashcode = " + subject.hashCode());
    DynamicProxyHandler handler = new DynamicProxyHandler(subject);
     subject = (Subject) Proxy.newProxyInstance(DynamicMethodImpl.class.getClassLoader(), RealSubject.class.getInterfaces(), handler);
    System.out.println("subject's = " + subject.getClass());
    System.out.println("real's hashcode2 = " + subject.hashCode());
    subject.rent("20");
    subject.sayHello("Tom");
  }
}
