/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zhamingd
 */
public class SyncMutleThreadsTest {


  public static void main(String[] args) {
    
    ThreadB b =new ThreadB("b1");
    b.start();
//    synchronized(b){
      System.out.println("Locked up");
      System.out.println("Counting, total is " + b.total);
      try {
      b.wait();
    } catch (InterruptedException ex) {
      System.out.println("2. Thread b state is " + b.getState());
    }
//    }
    
    System.out.println("Thread b state is " + b.getState());
    System.out.println("Counting complete, total is " + b.total);
    
    
  }  
}

class ThreadB extends Thread{
  public int total;
  public ThreadB(String name){
    super(name);
  }
  @Override
  public void run(){
      System.out.println("1. Thread b state is " + this.getState());
      for(int i = 0; i<10; i++) {
        //System.out.println(this.getName() + "running, i = " + i);
        total+=i;
      }
      System.out.println(this.getName() + " - Total is " + total);
      
    
  }
  
}

