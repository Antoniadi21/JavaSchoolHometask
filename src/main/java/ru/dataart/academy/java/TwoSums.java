package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        boolean isPairFound = false;
        int i = 0, length = nums.length;
        int[] result = new int[2];
        while (i < length - 1 && !isPairFound) {
            int j = i + 1;
            while (j < length && nums[i] + nums[j] <= target) {
                if (nums[i] + nums[j] == target) {
                    isPairFound = true;
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
                j++;
            }
            i++;
        }
        return result;
    }
}
