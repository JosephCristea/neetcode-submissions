class Solution:
    def countSeniors(self, details: List[str]) -> int:
        seniors = []

        for n in details:
            age = n[len(n) - 4 : len(n) - 2]

            if(int(age) > 60):
                seniors.append(age)
    
        return len(seniors)
        