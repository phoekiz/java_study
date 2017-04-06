/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import com.md.test.DefaultMethodTest;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author zhamingd
 */
public class DefaultMethodImpl implements DefaultMethodTest {
  
  public static void main(String[] args) {
    DefaultMethodImpl impl = new DefaultMethodImpl();
    impl.test();
    
    DefaultMethodImpl impl2 = new DefaultMethodImpl(){
      @Override
      public void test(){
        
        System.out.println("hahaha222");
      }
    };
    impl2.test();
  }
}
