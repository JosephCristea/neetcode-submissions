class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        values = set(nums)
        max_set = 0

        for n in values:

            if((n - 1) not in values):
                current_count = 0
                current_value = n
                while(current_value in values):
                    current_count += 1
                    max_set = max(current_count, max_set)
                    current_value += 1
            else:
                continue
        return max_set 

                    

        
        