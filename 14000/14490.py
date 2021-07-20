from math import gcd

x, y = map(int, input().split(":"))
print(int(x/gcd(x,y)), end =":")
print(int(y/gcd(x,y)))
