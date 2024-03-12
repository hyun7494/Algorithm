import sys
# N = int(input())
# list = []
# for i in range(N):
#   list.append(int(input()))
# list.sort()
# print(list)
# 계수정렬 이라는 것을 사용해야함
# 범위가 정해져 있는 큰 값을 정렬해야할때
# 

# N = int(input())


N= int(sys.stdin.readline())
count = [0]*10001
for i in range(N):
    # num = int(input())
    num = int(sys.stdin.readline())
    count[num] += 1

for j in range(1, 10001):
    if count[j] != 0:
        for k in range(count[j]):
            print(j)