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
public class RealSubject  implements Subject{

  @Override
  public void rent(String price) {
    System.out.println("renting price is " + price + "$");
  }

  @Override
  public void sayHello(String name) {
    System.out.println("Say hello to " + name);
  }
  
}
