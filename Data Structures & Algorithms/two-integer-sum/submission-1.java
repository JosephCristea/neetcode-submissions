class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Value, index
        HashMap<Integer, Integer> sumIndicies = new HashMap<>();

        //Iterate through nums
        for(int i = 0; i < nums.length; i++) {
            
            //If hash contains a number x, where num[i] + x == target,
            //return the indicies of x and nums[i]
            if(sumIndicies.containsKey(target - nums[i])) {
                return new int[] {sumIndicies.get(target - nums[i]), i};
            }
            //Else, add the value, index pair to hash
            sumIndicies.put(nums[i], i);
        }
        return new int[-1];

    }
}
