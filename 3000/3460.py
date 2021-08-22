t = int(input())
for _ in range(t):
    n = int(input())
    b = bin(n)[2:]
    for i in range(len(b)):
        if b[::-1][i] == '1':
            print(i, end=' ')
