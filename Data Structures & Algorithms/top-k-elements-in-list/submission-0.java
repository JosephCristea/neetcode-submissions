class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>(); 

        for(int n : nums) {
            if(frequency.containsKey(n)) {
                frequency.put(n, frequency.get(n) + 1);
            } else {
                frequency.put(n, 1);
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue(); 

            if(buckets[count] == null) {
                buckets[count] = new ArrayList<>(); 
            }

            buckets[count].add(number);
        }


        int[] result = new int[k];
        int counter = 0; 
        for(int i = buckets.length - 1; i >= 0 && counter < k; i--) {

            if(buckets[i] != null) {
                
                for(int number : buckets[i]) {
                    result[counter] = number;
                    counter++; 

                    if(counter == k) {
                        break; 
                    }
                }

            }
        }

        return result; 


        
        
    }
}
