# 오각형의 각 변에 아래 그림과 같이 점을 찍어 나간다. N단계에서 점의 개수는 모두 몇 개일까?

n = int(input())
dot = 5
for i in range(1, n):
  dot = (dot + (i + 2) + ((i + 1) * 2)) % 45678;
print(dot)
