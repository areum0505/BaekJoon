"""
대한고등학교에 재학 중인 민국이와 만세는 4과목(정보, 수학, 과학, 영어)에 대한 시험을 봤다. 민국이와 만세가 본 4과목의 점수를 입력하면, 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오. 단, 서로 동점일 때는 민국이의 총점 S를 출력한다.

"""

score1 = input().split()
score2 = input().split()

s, t = 0, 0

for i in score1:
    s += int(i)
for i in score2:
    t += int(i)

if s >= t:
    print(s)
else:
    print(t)

