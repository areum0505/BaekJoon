p, k = map(int, input().split())
li = [0 for i in range(1000001)]
result = 0

for i in range(2, 1001):
    if li[i] == 0:
        n = i * 2
        while n < 1000001:
            li[n] = 1
            n += i
for i in range(2, 1000001):
    if li[i] == 0:
        if p % i == 0:
            result = i
            break

if result == 0:
    print("GOOD")
else:
    if result < k:
        print("BAD", result)
    else:
        print("GOOD")
