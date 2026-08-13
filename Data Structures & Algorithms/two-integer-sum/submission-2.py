class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        factors = {}

        for i, n in enumerate(nums):
            factor = target - n
            if(factor not in factors):
                factors[n] = i
            else:
                return[factors[factor], i]