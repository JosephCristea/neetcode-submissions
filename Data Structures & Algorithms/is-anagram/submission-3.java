class Solution {
    public boolean isAnagram(String s, String t) {
        //character, frequency in each string
        HashMap<Character, Integer> stringOne = new HashMap<>();
        HashMap<Character, Integer> stringTwo = new HashMap<>();

        //If not same size, return false
        if(s.length() != t.length())
            return false; 

        //Iterate through length
        for(int i = 0; i < s.length(); i++) {
            //Update frequency of character in both hashes
            if(stringOne.containsKey(s.charAt(i))) {
                stringOne.put(s.charAt(i), stringOne.get(s.charAt(i)) + 1);
            } else {
                stringOne.put(s.charAt(i), 1);
            }

             if(stringTwo.containsKey(t.charAt(i))) {
                stringTwo.put(t.charAt(i), stringTwo.get(t.charAt(i)) + 1);
            } else {
                stringTwo.put(t.charAt(i), 1);
            }

        }

        //If anagram, char/freq should match, return true
        if(stringOne.equals(stringTwo)) 
            return true;
        return false; 
    }
}
