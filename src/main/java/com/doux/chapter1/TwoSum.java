package com.doux.chapter1;

import java.util.HashMap;

/**
 * @author ZhangTao
 * @create 2024-01-12-14:12
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,5};
        int[] res = twoSum(nums, 9);
        for (int num : res){
            System.out.print(num + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
