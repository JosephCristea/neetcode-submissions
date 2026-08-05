class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];

        //Prefix
        for(int i = 0; i < prefix.length; i++) {
            if(i == 0) {
                prefix[i] = 1;
            } else {
                prefix[i] = nums[i - 1] * prefix[i - 1];
            }

        }

        int[] suffix = new int [nums.length];

        //Suffix
        for(int j = nums.length - 1; j >= 0; j--) {
            if(j == nums.length - 1) {
                suffix[j] = 1;
            } else {
                suffix[j] = nums[j + 1] * suffix[j + 1];
            }

        }

        int[] product = new int[nums.length];

        //merge suffix + prefix
        for(int k = 0; k < nums.length; k++) {
            product[k] = prefix[k] * suffix[k];
        }

        return product;

    }
}  
