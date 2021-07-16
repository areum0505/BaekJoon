t = int(input())    # 테스트 데이터
for i in range(t):
    li = list(map(int, input().split()))
    even = [num for num in li if num % 2 == 0]
    print(sum(even), min(even))
