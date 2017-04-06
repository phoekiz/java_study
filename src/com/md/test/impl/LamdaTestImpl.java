/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import com.md.test.LamdaTest;

/**
 *
 * @author zhamingd
 */
public class LamdaTestImpl {
  public static void main(String[] args) {
    LamdaTest t = new LamdaTest();
    t.lam( k-> { System.out.print(k);});
  }
}
  