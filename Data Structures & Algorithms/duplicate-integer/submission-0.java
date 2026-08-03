class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> values = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            
            if(values.containsValue(nums[i])) {
                return true;
            }

            values.put(i, nums[i]);
        }
        return false; 
    }
}