class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
        freq=[0]*26
        for c in s:
            freq[ord(c)-ord('a')]+=1
        for c in t:
            freq[ord(c)-ord('a')]-=1
        for count in freq:
            if count!=0:
                return False
        return True
