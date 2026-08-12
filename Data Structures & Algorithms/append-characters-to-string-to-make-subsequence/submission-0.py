class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        read = 0 #reads s
        check = 0 #checks t

        while(read < len(s) and check < len(t)):
            if(s[read] == t[check]):
                check = check + 1
            read = read + 1


        return (len(t) - check)