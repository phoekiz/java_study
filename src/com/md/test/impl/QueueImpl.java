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
public class QueueImpl {
  Room head, current;
  
  public void put(Object data){
    if(head == null) {
      head = new Room(data, null);
      current=head;
    } else {
      Room r = new Room(data, null);
      current.next=r;
      current=r;
    }
  }
  
  public Object pop() {
    if(head == null){
      return null;
    }
    Object ret = head.data;
    head = head.next;
    
    return ret;
  }
  public static void main(String[] args) {
    
    QueueImpl stack = new QueueImpl();
    stack.put("111");
    stack.put("222");
    stack.put("333");
    Object o = stack.pop();
    while(o!=null){
      System.out.println(o);
      o = stack.pop();
    }
    
  }
}
