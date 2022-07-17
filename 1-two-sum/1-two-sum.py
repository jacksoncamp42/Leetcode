class Solution(object):
    def twoSum(self, nums, target):
        dif = {}
        for i in range(len(nums)): # O(n) - iterating through list
            difference = target - nums[i]
            if nums[i] in dif.keys(): # O(1) - dictionary access
                index1 = dif[nums[i]]
                return [i, index1]
            else:
                dif[difference] = i
        