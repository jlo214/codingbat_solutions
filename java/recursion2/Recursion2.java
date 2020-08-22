/*
8-20-2020
#1-4

8-21-2020
#5-

recursion practice problems from https://codingbat.com/java/Recursion-2
Problem Descriptions in READ_ME.txt
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Recursion2 {

    public static void main(String []args){
        //1
        int gSumSrt = 0;
        int[] gSumArr = {2,4,8};
        int gSumTgt = 8;
        boolean gSumRes = groupSum(gSumSrt, gSumArr, gSumTgt);
        System.out.println("1) ");
        System.out.println("start: "+gSumSrt+" target: "+gSumTgt);
        Arrays.stream(gSumArr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("gSumRes: "+gSumRes+"\n");   

        //2
        int gSum6Srt = 0;
        int[] gSum6Arr = {5,6,2};
        int gSum6Trgt = 8;
        boolean gSum6Res = groupSum6(gSum6Srt, gSum6Arr, gSum6Trgt);
        System.out.println("2) ");
        System.out.println("start: "+gSum6Srt+" target: "+gSum6Trgt);
        Arrays.stream(gSum6Arr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("gSum6Res: "+gSum6Res+"\n");   

        //3          
        int gNoAdjSrt = 0;
        int[] gNoAdjArr = {2,5,10,4};
        int gNoAdjTrgt = 12;
        boolean gNoAdjRes = groupNoAdj(gNoAdjSrt, gNoAdjArr, gNoAdjTrgt);
        System.out.println("3) ");
        System.out.println("start: "+gNoAdjSrt+" target: "+gSum6Trgt);
        Arrays.stream(gNoAdjArr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("gNoAdjRes: "+gNoAdjRes+"\n");

        //4
        int gSum5Srt = 0;
        int[] gSum5Arr = {2,5,10,4};
        int gSum5Trgt = 19;
        boolean gSum5Res = groupSum5(gSum5Srt, gSum5Arr, gSum5Trgt);
        System.out.println("4) ");
        System.out.println("start: "+gSum5Srt+" target: "+gSum5Trgt);
        Arrays.stream(gSum5Arr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("gSum5Res: "+gSum5Res+"\n");

        //5        
        int gSClumpSrt = 0;
        int[] gSClumpArr = {8,2,2,1};
        int gSClumpTrgt = 9;
        boolean gSClumpRes = groupSumClump(gSClumpSrt, gSClumpArr, gSClumpTrgt);
        System.out.println("5) ");
        System.out.println("start: "+gSClumpSrt+" target: "+gSClumpTrgt);        
        Arrays.stream(gSClumpArr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");        
        System.out.println("gSClumpRes: "+gSClumpRes+"\n");

        //6
        int[] splitArrayArr = {5,2,3};
        boolean splitArrayRes = splitArray(splitArrayArr);
        System.out.println("6) ");        
        System.out.println("start: "+0+" target: "+0);        
        Arrays.stream(splitArrayArr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");        
        System.out.println("splitArrayRes: "+splitArrayRes+"\n");

        //7
        int[] sOdd10Arr = {6,5,5,5,1};
        boolean sOdd10Res = splitOdd10(sOdd10Arr);
        System.out.println("7) ");            
        System.out.println("start: "+0+" i: "+0+" group1: "+0+" group2: "+0); 
        Arrays.stream(sOdd10Arr).forEach((e) -> System.out.print(e+" "));  
        System.out.println("");
        System.out.println("sOdd10Res: "+sOdd10Res+"\n");

        //8
        int[] s53Arr = {3,5,8};
        boolean s53Res = split53(s53Arr);
        System.out.println("8) ");
        System.out.println("start: "+0+" i: "+0+" group1: "+0+" group2: "+0); 
        Arrays.stream(s53Arr).forEach((e) -> System.out.print(e+" "));
        System.out.println("");
        System.out.println("s53Res: "+s53Res+"\n");

    }
    
    //1
    //looked up, had no idea
    public static boolean groupSum(int start, int[] nums, int target) {
        /*System.out.println("");
        System.out.println("start: "+start);
        System.out.println("target: "+target);
        if(start < nums.length)
            System.out.println("nums[start]: "+nums[start]);*/

        if(start >= nums.length)
            return (target == 0); //returns true or false

        if(groupSum(start+1, nums, target-nums[start]))
            return true;
            
        if(groupSum(start+1, nums, target))
            return true;
  
        return false;
    }    

    //2
    //looked up
    public static boolean groupSum6(int start, int[] nums, int target) {
        /*System.out.println("");
        System.out.println("start: "+start);
        System.out.println("target: "+target);
        if(start < nums.length)
            System.out.println("nums[start]: "+nums[start]);*/
            
        if(start >= nums.length)
            return (target == 0);

        if(nums[start] == 6)    
            return groupSum6(start+1, nums, target-nums[start]); //1 4th

        if(groupSum6(start+1, nums, target-nums[start])) //0 2 5th 7th
            return true;
            
        if(groupSum6(start+1, nums, target)) //3 6th
            return true;
  
        return false;
    }    

    //3
    //solo, seen similar problem before
    public static boolean groupNoAdj(int start, int[] nums, int target) {
  
        if(start >= nums.length)
            return (target == 0); //return true or false
        
        //take 1st
        if( groupNoAdj(start+2, nums,  target - nums[start]) )
            return true;
            
        //don't take first
        if( groupNoAdj(start+1, nums, target) )
            return true;          
            
        return false;
    }
    
    //4
    public static boolean groupSum5(int start, int[] nums, int target) {
            
      if(start >= nums.length)
          return (target == 0);
      
      //take if multiple of 5
      if(nums[start] % 5 == 0){
          //if next val == 1, skip it
          if(start+1 < nums.length && nums[start+1] == 1)
              return groupSum5( start+2, nums, target-nums[start] );
          //else if next val != 1, take it
          return groupSum5(start+1, nums, target-nums[start]);
      }
      
      //take normal
      if(groupSum5(start+1, nums, target-nums[start]))
          return true;
      //don't take
      if(groupSum5(start+1, nums, target))
          return true;
      
      return false;  
    }

    //5
    //Solo, looked up if's on identical vals. Not optimized.
    public static boolean groupSumClump(int start, int[] nums, int target) {
        //base case 
        if(start >= nums.length)
            return (target == 0);
        
        //check to see if adj vals are equal, if so use all of them or none of them 
        int prevI = start;
        int idenNumTotal = 0;
        for(int i=start+1; i<nums.length; i++){
            if( i - prevI == 1 && nums[i] == nums[start]){
                prevI += 1;
                idenNumTotal += nums[i];
            }
        }

        //original attempt is commented out, was trying to use same if condition...
        //if there are adj equal vals use them all see if they equal target 
        if(idenNumTotal != 0) {
            idenNumTotal += nums[start];
            //return groupSumClump(start+prevI, nums, target-idenNumTotal);
            if (groupSumClump(start+prevI, nums, target-idenNumTotal))
              return true;
            return groupSumClump(start+prevI, nums, target);
        }
        //if there are adj equal vals skip them all see if they equal target 
        /*else if(idenNumTotal != 0) {
            return groupSumClump(start+prevI, nums, target);
        }*/
        
        //take cur val
        if(groupSumClump(start+1, nums, target-nums[start])){
           return true; 
        }
        
        //don't take cur val
        if(groupSumClump(start+1, nums, target)){
            return true;
        }
        
        //if not possible to get target 
        return false;
    }

    //6
    public static boolean splitArray(int[] nums) {
        return splitArray(nums, 0, 0);
    }
    
        //helper method
        public static boolean splitArray(int[] nums, int index, int target) {
            
            //base condition
            if(index >= nums.length){
                return (target == 0);
            }
            
            if(splitArray(nums, index+1, target+nums[index]))
                return true;
            
            if(splitArray(nums, index+1, target-nums[index]))
                return true;
            return false;
        }

    //7
    //solo 
    public static boolean splitOdd10(int[] nums) {
        return splitOdd10(nums, 0, 0, 0);
    }
        //helper method
        public static boolean splitOdd10(int[] nums, int i, int group1, int group2) {
            
            //base case 
            if(i >= nums.length){
                //System.out.println("group1: "+group1+" group2: "+group2);
                return (group1 % 2 != 0 && group2 % 10 == 0 || group2 % 2 != 0 && group1 % 10 == 0);
            }
            
            if(splitOdd10(nums, i+1, group1+nums[i], group2))
                return true;
            
            return splitOdd10(nums, i+1, group1, group2+nums[i]);            
        }

    //8
    public static boolean split53(int[] nums) {
        return split53(nums, 0, 0, 0);
    }

        public static boolean split53(int[] nums, int i, int group1, int group2) {
            //base case 
            if(i >= nums.length){
                //System.out.println("group1: "+group1+" group2: "+group2);
                return (group1 == group2);
            }
            
            //mul of 5 go in g2 
            if(nums[i] % 5 == 0){
                if ( split53(nums, i+1, group1, group2+nums[i]) )
                    return true;
                return false;
            }
            
            //mul of 3 but not of 5 go in g1
            if(nums[i] % 3 == 0 && nums[i] % 5 != 0){
                if(split53(nums, i+1, group1+nums[i], group2))
                    return true;
                return false;
            }
            
            //take cur val for g1  
            if(split53(nums, i+1, group1+nums[i], group2))
                return true;
            
            //take cur val for g2 
            if(split53(nums, i+1, group1, group2+nums[i]))
                return true;
            return false;
        }

}