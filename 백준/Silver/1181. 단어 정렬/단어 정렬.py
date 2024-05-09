N = int(input())
lst = []
for i in range(N):
  lst.append(input())
setLst = set(lst)
sortLst = list(setLst)
sortLst.sort()
# sort안에 key라는 걸로 지정가능
sortLst.sort(key = len)

for j in sortLst:
  print(j)