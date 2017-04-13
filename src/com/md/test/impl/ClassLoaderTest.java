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
public class ClassLoaderTest {
  public static void main(String[] args){
    
    String s = new String("1111");
    Object o = new Object();
    
    System.out.println(new ClassLoaderTest().getClass().getClassLoader());
    System.out.println(new Object().getClass().getClassLoader());
  }
}
