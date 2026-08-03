class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Value, index
        HashMap<Integer, Integer> sumIndicies = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            
            if(sumIndicies.containsKey(target - nums[i])) {
                return new int[] {sumIndicies.get(target - nums[i]), i};
            }

            sumIndicies.put(nums[i], i);
        }
        return new int[-1];

    }
}
