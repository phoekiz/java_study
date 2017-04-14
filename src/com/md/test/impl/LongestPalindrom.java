/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

/**
 *
 * @author zhamingd 找到长度最长的abccba字符串
 */
public class LongestPalindrom {

  public static String longestPalindrome1(String s) {
    if (s.isEmpty()) {
      return null;
    }

    if (s.length() == 1) {
      return s;
    }

    String longest = s.substring(0, 1);
    for (int i = 0; i < s.length(); i++) {
      // get longest palindrome with center of i
      String tmp = helper(s, i, i);
      if (tmp.length() > longest.length()) {
        longest = tmp;
      }

      // get longest palindrome with center of i, i+1
      tmp = helper(s, i, i + 1);
      if (tmp.length() > longest.length()) {
        longest = tmp;
      }
    }

    return longest;
  }
// Given a center, either one letter or two letter, 
// Find longest palindrome

  public static String helper(String s, int begin, int end) {
    while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
      begin--;
      end++;
    }
    return s.substring(begin + 1, end);
  }

  public static String longestPalindrome2(String s) {
    if (s == null || s.length() <= 1) {
      return s;
    }

    int len = s.length();
    int maxLen = 1;
    boolean[][] dp = new boolean[len][len];

    String longest = null;
    for (int l = 0; l < s.length(); l++) {
      for (int i = 0; i < len - l; i++) {
        int j = i + l;
        if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
          dp[i][j] = true;

          if (j - i + 1 > maxLen) {
            maxLen = j - i + 1;
            longest = s.substring(i, j + 1);
          }
        }
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    String ret = longestPalindrome1("dabcba");
    String ret2 = longestPalindrome2("dabcba");
//    System.out.println(ret);
    System.out.println(ret);
  }
}