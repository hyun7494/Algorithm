import sys
N, K = map(int, sys.stdin.readline().split())
# list = [0]*N
list = []
list2 = []
loc = 0
for i in range(1,N+1):
    list.append(i)
# print(list)
while len(list) != 0:
    loc += (K-1)
    loc = loc%(len(list))
    list2.append(list.pop(loc))

# 할때마다 리스트 길이를 측정, 길인를 넘어서면 빼서 아픙로
# print(list2)
print("<", end="")
print(*list2, sep=', ', end="")
print(">")

# 1   4
#     3     6    2  7 5