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
public class ReturnFinallyTest {
  
  public static String run(){
    String x = "111";
    try{
      x="222";
      return x;
    }catch (Exception e){
      
    } finally{
      System.out.println("finally called");
      x = "333";
    }
      
    return x;
  }
  public static void main(String[] args){
    String ret = run();
    
    System.out.println(ret);
    // --> 222
    /*
    if return in finally, return in try clause will be ignored.
    */
    
  }
}
