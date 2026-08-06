class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newArray = new int[2 * nums.length];

        for(int i = 0; i < nums.length * 2; i++) {
            if(i < nums.length) {
                newArray[i] = nums[i];
            } else {
                newArray[i] = nums[i - nums.length];
            }

        }
        return newArray; 
        
    }
}