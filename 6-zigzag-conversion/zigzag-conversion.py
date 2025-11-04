class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows==1 or s=="":
            return s
        cycle=2*numRows-2
        rows=['']*numRows
        for i, char in enumerate(s):
            poscycle=i%cycle
            row=poscycle if poscycle<numRows else cycle-poscycle
            rows[row]+=char
        return "".join(rows)
        
