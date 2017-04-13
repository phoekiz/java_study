/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

/**
 *
 * @author zhamingd
 */
public class OverideTestImpl_1 {
  static void staticFunction(Object obj) {
    System.out.println("This is call in object");
  }
  static void staticFunction(String str) {
    System.out.println("This is call in string");
  }
  
//  static void staticFunction(Integer num) {
//    System.out.println("This is call in Integer");
//  }
  
  public static void main(String[] args) {
    Object o = new String("123");
    staticFunction(o);
    //System.out.println(null instanceof String);
  }
}
