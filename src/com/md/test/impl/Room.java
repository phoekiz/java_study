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
class Room{
  Object data;
  Room next;
  public Room(Object data, Room next){
    this.data=data;
    this.next=next;
  }
}