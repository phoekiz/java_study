/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import java.util.HashMap;

/**
 *
 * @author zhamingd
 */
public class LengthOfLongestSubStringSolution {

  public static int lengthOfLongestSubstring(String s) {
    int max = 0;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
      String sub = s.substring(start, i);
      System.out.println("substring = " + sub);
      char c = s.charAt(i);
      System.out.println("c = " + c);
      if(sub.indexOf(c)<0 && sub.length()+1 > max){
        max = sub.length()+1;
        System.out.println("max found for this, length = " + max + ", string = " + sub+c);
      } else {
        start+=sub.indexOf(c)+1;
        
      }
    }
    if(max == 0) {
      return s.length();
    }
    return max;
  }
  public static void main(String[] args){
    String s = "wsbbgacwionulhxwgctzqktwbqvfrzoqrrrztvvbmlwxstwaxpcnbxlcngkhhyxaqqzlovnagjza";
    System.out.print(lengthOfLongestSubstring(s));
  }
}
