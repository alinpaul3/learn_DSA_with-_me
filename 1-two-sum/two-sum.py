class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        tosum={}
        for i, num in enumerate(nums):
            diff=target-num
            if diff in tosum:
                return [tosum[diff],i]
            tosum[num]=i
        return []