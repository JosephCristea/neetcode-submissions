class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s = s.strip()
        pointer = len(s) - 1

        if(len(s) == 1):
            return 1

        while(s[pointer] != " "):
            pointer = pointer - 1

        return (len(s) - 1 - pointer)

            
