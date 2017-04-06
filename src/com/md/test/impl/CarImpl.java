/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import com.md.test.Car;

/**
 *
 * @author zhamingd
 */
public class CarImpl  {
  
  public static void main(String[] args){
    Car car = ()->{
      System.out.print("paint to red");
    };
    car.paint();
  }
}
