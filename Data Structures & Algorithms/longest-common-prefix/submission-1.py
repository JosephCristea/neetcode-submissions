class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        length = len(strs[0])

        for n in strs:
            while n[0:length] != prefix[0:length]:
                length -= 1
                
        return prefix[0:length]