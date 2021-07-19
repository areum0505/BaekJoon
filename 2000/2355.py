a, b = map(int, input().split())
result = (a + b) * (abs(b - a) + 1) // 2
print(result)
