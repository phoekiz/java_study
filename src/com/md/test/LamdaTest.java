/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author zhamingd
 */
public class LamdaTest {
  public  void lam(Consumer<String> action){
    String t = Double.toString(Math.random());
    action.accept(t);
  }
}
