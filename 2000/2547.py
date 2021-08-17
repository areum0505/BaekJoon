t = int(input())
for _ in range(t):
    a = input()
    n = int(input())
    li = [int(input()) for i in range(n)]
    print("YES" if sum(li) % n == 0 else "NO")
