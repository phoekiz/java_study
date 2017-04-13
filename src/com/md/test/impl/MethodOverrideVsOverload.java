package com.md.test.impl;

public class MethodOverrideVsOverload {
 
 @Override
 public boolean equals( Object other ) {
     System.out.println("MethodOverrideVsOverload equals method reached" );
     return true;
   }
 
 public static void main(String[] args) {
  Object o1 = new MethodOverrideVsOverload();
  Object o2 = new MethodOverrideVsOverload();
  //Thread t = Thread.currentThread();
  MethodOverrideVsOverload o3 = new MethodOverrideVsOverload();
  MethodOverrideVsOverload o4 = new MethodOverrideVsOverload();
 
  if(o1.equals(o2)){
   System.out.println("objects o1 and o2 are equal");
  }
 
  if(o3.equals(o4)){
   System.out.println("objects o3 and o4 are equal");
  }
 }
}
//
//class MethodSubClass extends MethodOverrideVsOverload{
//  
//  @Override
//  public boolean equals(MethodOverrideVsOverload other){
//    System.out.println("subclass equals method reached" );
//    return true;
//  }
//}