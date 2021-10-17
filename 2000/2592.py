from collections import Counter

num = []
for _ in range(10):
    num.append(int(input()))
print(sum(num) // 10)
cnt = Counter(num)
mode = cnt.most_common(1)
print(mode[0][0])
