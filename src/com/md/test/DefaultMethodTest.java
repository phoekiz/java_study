/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test;

/**
 *
 * @author zhamingd
 */
public interface DefaultMethodTest {
  public default void test(){
    System.out.print("DefaultMethodTest!!!");
  }
}
