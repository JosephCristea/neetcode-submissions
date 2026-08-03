class Solution {

    public String encode(List<String> strs) {
        String secret = "";
    
        for(String s : strs) {
            secret += s.length() + "#" + s;
        }
        return secret;
    }

    public List<String> decode(String str) {
       List<String> wordList = new ArrayList<>();
    int startWord = 0;

    while(startWord < str.length()) {
      int pointer = startWord;

      while(str.charAt(pointer) != '#') {
        pointer++;
      }

      System.out.println("startWord: " + startWord + " Pointer: " + pointer);
      int wordLength = Integer.parseInt(str.substring(startWord, pointer));

      String temp = "";
      temp = str.substring(pointer + 1, pointer + 1 + wordLength);
      wordList.add(temp);
      
      startWord = pointer + 1 + wordLength;

    }
    
    return wordList;
    
    }
}
