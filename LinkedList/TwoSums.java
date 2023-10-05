package LinkedList;

import java.util.HashMap;

public class TwoSums {
    private static int[] findTwoSum_BruteForce(int[] nums, int target){
        for(int i = 0; i< nums.length; i++){
            for (int j =i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

//    Using Hashmap
    private static int[] twoSum_HashMap(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement)){
                return new int[] {numMap.get(complement), i};
            }else{
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
