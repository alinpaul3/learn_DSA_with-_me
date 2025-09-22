class Solution(object):
    def calPoints(self, operations):
        stack=[]
        for i in operations:
            if i=="C":
                stack.pop()
            elif(i=="D"):
                stack.append(2*stack[-1])
            elif i=="+":
                a=stack[-1]
                b=stack[-2]
                stack.append(a+b)
            else:
                stack.append(int(i))
        sum=0
        for i in stack:
            sum+=i
        return sum
