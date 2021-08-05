s, k, h = map(int, input().split())

if s + k + h >= 100:
  print('OK')
else:
  if s == min(s, k, h):
    print('Soongsil')
  elif k == min(s, k, h):
    print('Korea')
  else:
    print('Hanyang')
