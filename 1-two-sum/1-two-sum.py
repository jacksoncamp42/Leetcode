class Solution(object):
    def twoSum(self, nums, target):
        hashmap = {}
        for i in range(len(nums)): # O(n) - iterating through list
            difference = target - nums[i]
            if nums[i] in hashmap: # O(1) - dictionary access
                return [i, hashmap[nums[i]]]
            else:
                hashmap[difference] = i
        