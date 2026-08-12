class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        current = 0
        best = 0

        for n in nums:
          if(n == 1):
            current += 1
            best = max(current, best)
          else:
            current = 0
        return best
