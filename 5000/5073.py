import sys
while True:
    a, b, c = map(int, sys.stdin.readline().split())
    if a == 0 and b == 0 and c == 0: 
        break
    elif (a + b + c - max(a, b, c)) <= max(a, b, c):
        print("Invalid")
    elif a == b and b == c:
        print("Equilateral")
    elif a == b or b == c or a == c:
        print("Isosceles")
    else:
        print("Scalene")
