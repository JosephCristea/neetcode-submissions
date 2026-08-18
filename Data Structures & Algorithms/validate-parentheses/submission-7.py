class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for n in s:
            if(n == "(" or n == "{" or n == "["):
                stack.append(n)
            else:
                if(len(stack) == 0):
                    return False
                if(n == ")" and stack[-1] == "("):
                    stack.pop()
                elif(n == "]" and stack[-1] == "["):
                    stack.pop()
                elif(n == "}" and stack[-1] == "{"):
                    stack.pop()
                else:
                    return False
        if(len(stack) != 0):
            return False
        return True 
                
                    
                    
            
