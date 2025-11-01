class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i = 0  # Pointer for s
        for char in t:
            if i < len(s) and char == s[i]:
                i += 1
        return i == len(s)
        