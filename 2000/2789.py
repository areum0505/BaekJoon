word = input()
result = ''
for w in word:
    if w not in 'CAMBRIDGE':
        result += w
print(result)
