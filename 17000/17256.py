"""
SCCC의 회장 욱제는 케이크 수를 이용해 문제를 만들기로 했다. 마카롱과 욱제를 기쁘게 하기 위해서 문제를 풀어주자! 욱제가 만든 문제는 다음과 같다.
케이크 수 a, c 가 주어졌을 때, 다음을 만족하는 케이크 수 b를 계산하자.
a 🍰 b = c
a, c는 b가 항상 유일하게 존재하도록 주어진다.
"""



ax, ay, az = map(int, input().split())
cx, cy, cz = map(int, input().split())
print(cx - az, cy // ay, cz - ax)
