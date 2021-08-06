nums = []
people = 0 

for _ in range(4) :
    out_num, in_num = map(int,input().split())
    people += in_num 
    people -= out_num
    nums.append(people)
    
print(max(nums))
