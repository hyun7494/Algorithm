N = int(input())
n = {}
for i in (input().split()):
  if i in n:
    n[i] += 1
  else:
    n[i] = 1
M = int(input())
for j in (input().split()):
  if j in n:
    print(n[j], end= " ")
  else:
    print(0, end=" ")