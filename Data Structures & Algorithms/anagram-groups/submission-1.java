class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Hasmap <letter counter, Strings with same letter count>
        HashMap<String, List<String>> anagramList = new HashMap<>();

        //iterate through strings array
        for(int i = 0; i < strs.length; i++) {
            //This will store the letter count for each string
            int[] count = new int[26];
            //Create a temp list to store strings if
            //a list for a count doesnt exist yet
            List<String> init = new ArrayList<>(); 
            
            //Iterate through each char
            for(int j = 0; j < strs[i].length(); j++) {
                //Create letter count 
                count[strs[i].charAt(j) - 'a']++;
            }

            //If this count ket doesnt exist
            if(!anagramList.containsKey(Arrays.toString(count))) {
                //Add string to temp list (init)
                init.add(strs[i]);
                //Add <letter count, temp list> to map
                anagramList.put(Arrays.toString(count), init);
            //else simply update map
            } else {
                //get List for count, add the string, update map
                List<String> temp = anagramList.get(Arrays.toString(count));
                temp.add(strs[i]);
                anagramList.put(Arrays.toString(count), temp);
            }

        }


        //Add all strs to list
        List<List<String>> finalList = new ArrayList<>();
        //order doesnt matter, add each value list to finalList
        for(String key : anagramList.keySet()) {
            finalList.add(anagramList.get(key));
        }
        
        return finalList;

    }
}
