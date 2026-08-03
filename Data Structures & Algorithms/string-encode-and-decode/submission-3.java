class Solution {

    public String encode(List<String> strs) {
        String secret = "";

        //Append length, delimiter symbol, string 
        //pattern: length + delimiter + string 
        for(String s : strs) {
            secret += s.length() + "#" + s;
        }
        return secret;
    }

    public List<String> decode(String str) {
        //Each word will be appended here
        List<String> wordList = new ArrayList<>();
        //pointer that marks the beginning of new substring, ie length of next string
        int startWord = 0;

        //While pointer is in bounds of str
        while(startWord < str.length()) {
            //new pointer that starts at start of each substring 
            int pointer = startWord;

            //Stop until new pointer hits delimiter char
            while(str.charAt(pointer) != '#') {
                pointer++;
            }

            //Takes the 1 or 2 digit substring and converts it to length
            int wordLength = Integer.parseInt(str.substring(startWord, pointer));

            //Takes substring from # to next integer substring(exclusive)
            String temp = "";
            temp = str.substring(pointer + 1, pointer + 1 + wordLength);
            wordList.add(temp);
            
            //assign this pointer to start of next substirng
            startWord = pointer + 1 + wordLength;
        }
    
    return wordList;
    
    }
}
