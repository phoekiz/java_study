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
public class SingletonTest {
  
  public static void main(String[] args){
    
    Runnable r = ()->{
      Singleton3.INSTANCE.sayHello();
    };

    for(int i = 0; i<20; i++) {
      new Thread(r).start();
    }
    
    System.out.println(Singleton3.INSTANCE.getClass().getName());
  }
}

/*
  double locked checking pattern
*/
class Singleton1{
  private static Singleton1 instance = null;
  
  private Singleton1(){};
  
  public static Singleton1 getInstance(){
    if(instance == null){
      synchronized(Singleton1.class){
        if(instance == null){
          instance = new Singleton1();
        }
      }
      
    }
    return instance;
  }
  
}

/*
  nested inner class
*/
class Singleton2 {  
    private static class SingletonHolder {  
        private static final Singleton2 INSTANCE = new Singleton2();  
    }  
    private Singleton2 (){}  
    public static final Singleton2 getInstance() {  
        return SingletonHolder.INSTANCE; 
    }  
}

class SingletonObj{
  
}
enum Singleton3{
  INSTANCE(){
    double ran = Math.random();
    public void sayHello(){
      System.out.println(ran);
    }
  };
  public abstract void sayHello();
  
}