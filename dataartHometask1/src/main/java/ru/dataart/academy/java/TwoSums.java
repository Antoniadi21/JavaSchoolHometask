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
        int i = 0, j = 0, length = nums.length;
        while (i < length - 1 && !isPairFound) {
            j = i + 1;
            while (j < length && nums[i] + nums[j] <= target) {
                if (nums[i] + nums[j] == target) {
                    isPairFound = true;
                }
                j++;
            }
            i++;
        }
        int[] result;
        if (!isPairFound)
            result = new int[0];
        else {
            result = new int[] {nums[i - 1], nums[j - 1]};
        }
        return result;
    }
}
