import sys

n, t = map(int, sys.stdin.readline().split())
tmp = list(map(int, sys.stdin.readline().split()))
cnt = 0
for i in range(n):
    if t - tmp[i] >= 0:
        cnt += 1
        t -= tmp[i]
    else:
        break
print(cnt)
