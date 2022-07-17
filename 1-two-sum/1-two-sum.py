class Solution(object):
    def twoSum(self, nums, target):
        dif = {}
        for i in range(len(nums)): # O(n) - iterating through list
            difference = target - nums[i]
            if nums[i] in dif: # O(1) - dictionary access
                return [i, dif[nums[i]]]
            else:
                dif[difference] = i
        