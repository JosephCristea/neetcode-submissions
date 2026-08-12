class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        
        read = 0 #reads t
        check = 0 #checks s

        if(len(s) == 0):
            return True
        
        while read < len(t) and check < len(s):
            if(t[read] == s[check]):
                read = read + 1
                check = check + 1
            else:
                read = read + 1
        
        if(check == len(s)):
            return True
        else:
            return False
