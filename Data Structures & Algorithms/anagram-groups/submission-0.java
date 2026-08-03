class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramList = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            List<String> init = new ArrayList<>(); 
            
            for(int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }

            if(!anagramList.containsKey(Arrays.toString(count))) {
                init.add(strs[i]);
                anagramList.put(Arrays.toString(count), init);
            } else {
                List<String> temp = anagramList.get(Arrays.toString(count));
                temp.add(strs[i]);
                anagramList.put(Arrays.toString(count), temp);
            }

        }

        List<List<String>> finalList = new ArrayList<>();
        for(String key : anagramList.keySet()) {
            finalList.add(anagramList.get(key));
        }
        
        return finalList;

    }
}
