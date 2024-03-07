K = int(input())
list = []
calc = 0
for i in range(K):
  num = int(input())
  if num != 0:
    list.append(num)
  else:
    list.pop(-1)
if len(list)==0 :
  print(0)
else:
  for j in list:
    calc += j
  print(calc)