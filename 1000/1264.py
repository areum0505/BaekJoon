while True:
    sentence = input()
    count = 0
    if sentence == '#':
        break
    for c in sentence:
        if c in 'aeiouAEIOU':
            count += 1
    print(count)
