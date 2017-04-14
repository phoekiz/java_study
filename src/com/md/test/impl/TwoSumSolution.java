/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.md.test.impl;

import java.util.Arrays;

/**
 *
 * @author zhamingd
 */
public class TwoSumSolution {

  public static int[] twoSum(int[] nums, int target) {
        int[] nums1 = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums1);
        System.out.println("target = " + target);
        System.out.println(-5<-8);
    //System.out.println(Arrays.toString(nums));
    int a=0, b=0;
    int i=0, j=nums.length;
    int tmp = 0;
    int result = 0;
    while(true){
      a=nums[i];
      b=nums[j];
      
      tmp = a+b;
      result = tmp - target;
      System.out.printf("%s + %s = %s, expceted = %s", a,b,tmp, result);
      System.out.println();
      if(result>0){
        if(target>=0)
            --j;
                    else {
          ++i;
        };
      } else if (result<0){
        if(target>=0)
             ++i;
                    else {
         --j;
        };
      } else if(tmp == target){
        System.out.println(a+ ", " + b);
        int[] x = {Arrays.binarySearch(nums,a), Arrays.binarySearch(nums, b)};
        return x;
      }else if(result==0){
        System.out.println("not target match");
        break;
        
      }
    }
    return null;
    }
  public static void main(String[] args) {
    int[] param = {-1,-2,-3,-4,-5};
    System.out.println(Arrays.asList(twoSum(param, -8)).toString());
  }
}
