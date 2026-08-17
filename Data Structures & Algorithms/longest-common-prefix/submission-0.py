class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        length = len(prefix)

        for n in strs:
            while n[0:length] != prefix[0:length]:
                length -= 1
                
        return prefix[0:length]