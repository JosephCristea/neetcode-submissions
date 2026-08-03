class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Create hasmap: <Value, Frequency>
        HashMap<Integer, Integer> frequency = new HashMap<>(); 
        
        //Iterate through nums
        for(int n : nums) {
            //If key already exists, increase frequency by 1
            if(frequency.containsKey(n)) {
                frequency.put(n, frequency.get(n) + 1);
            //Else create key with frequency 1
            } else {
                frequency.put(n, 1);
            }
        }

        //Create buckets; each index represents frequency
        //List at that index is the numbers with that frequency
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

        //For each key, value pair
        for (HashMap.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue(); 

            //If there is no list at this index
            if(buckets[count] == null) {
                //Create one
                buckets[count] = new ArrayList<>(); 
            }

            //Add number to this index(frequency)
            buckets[count].add(number);
        }

        //Array to return with length k
        int[] result = new int[k];
        int counter = 0; 
        //iterates backwards through buckets
        for(int i = buckets.length - 1; i >= 0 && counter < k; i--) {

            //If bucket is not null
            if(buckets[i] != null) {
                
                //For each value at index i
                for(int number : buckets[i]) {
                    //add to result array
                    result[counter] = number;
                    counter++; 
                    //As long as k condition is satisfied
                    if(counter == k) {
                        break; 
                    }
                }

            }
        }
    
        return result; 


        
        
    }
}
