class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.strip(" ").split()
        s1=s[::-1]
        return " ".join(s1)