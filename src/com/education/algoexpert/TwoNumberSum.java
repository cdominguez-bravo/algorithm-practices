package com.education.algoexpert;

import java.util.Arrays;

public class TwoNumberSum {

    public static int[] twoNumberSum(int [] nums, int targetSum){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;

        while (left < right){
            int currentSum = nums[left] + nums[right];
            if (currentSum == targetSum){
                System.out.println("Valores: "+nums[left] +", "+nums[right]+" targetSum: "+ targetSum);
                return new int[] {nums[left],nums[right]};
            }else if(currentSum < targetSum){
                left++;
            }else if (currentSum > targetSum){
                right--;
            }
        }
        return  new int[0];

    }
    public static void main(String[] args) {
        //int[] myArray = {-2,1,3,5,8,10,12};
        int[] myArray = {3, 5, -4, 8, 11, 1, -1, 6};
        twoNumberSum(myArray,10);
    }
}
