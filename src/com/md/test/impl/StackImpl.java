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
public class StackImpl {
  Room head;
  public void put(Object data){
    if(head==null) {
      head = new Room(data, null);
    } else {
      Room current = new Room(data, head);
      head=current;
    }
  }
  
  public Object pop(){
    if(head==null){
      return null;
    }
    Room ret = head;
    head=head.next;
    return ret.data;
  }
  
  public static void main(String[] args) {
    
    StackImpl stack = new StackImpl();
    int i = 0;
    while(i++<100){
      stack.put(i+"");
    }
    Object o = stack.pop();
    while(o!=null){
      synchronized(stack) {
        o = stack.pop();
        new Thread(new StackFetcher(o)).start();
      }
      
    }
    
  }
}



class StackFetcher implements Runnable {
  Object o = null;
  public StackFetcher(Object o) {
    this.o = o;
  }
  @Override
  public void run() {
    System.out.println(o);
  }

}


