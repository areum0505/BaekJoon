a, b, c, d = map(int, input().split())
li = sorted([a, b, c, d])
print(abs((li[0] + li[3]) - (li[1] + li[2])))

"""
4명의 친구가 탁구를 하고 있다. 각각은 정수형으로 표현된 스킬 레벨을 가지고 있고, 숫자가 높을수록 더 좋은 플레이어다.

4명의 친구는 각각 두 명씩 구성된 두 팀을 구성하려고 한다. 게임이 더 흥미롭게 하기 위해서 팀의 스킬 레벨을 최대한 가깝게 유지하기를 원한다. 팀의 스킬 레벨은 팀원의 스킬 레벨의 합계이다.

그들은 탁구 선수로는 탁월하지만, 수학이나 컴퓨터와 같은 다른 것들에 능숙하지 않다. 팀의 스킬 레벨이 가능한 작은 차이를 갖도록 도와주자.

"""
