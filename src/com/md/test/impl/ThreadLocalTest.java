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
public class ThreadLocalTest {
  
  public static void main(String[] args) throws InterruptedException{
    
    Counter c = new Counter();
    Runnable r = ()->{
        c.setCount(c.getCount()+1);
    };
    
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    Thread t3 = new Thread(r);
    t1.start();
    t2.start();
    t3.start();
    System.out.println("Main thread: " + c.getCount());
    
  }
}

class Counter{
  volatile static int count=0;
  public void setCount(int v) {
    //System.out.println("[" + Thread.currentThread().getName() + "] Before Value = " + count);
    count=v;
    //System.out.println("[" + Thread.currentThread().getName() + "] After Value = " + count);
  }
  public int getCount(){
    return count;
  }
}
