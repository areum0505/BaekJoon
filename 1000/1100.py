status = []
answer = 0
for _ in range(8):
    status.append(list(input()))
for i in range(8):
    for j in range(8):
        if (i + j) % 2 == 0:
            if status[i][j] == 'F':
                answer += 1
print(answer)
