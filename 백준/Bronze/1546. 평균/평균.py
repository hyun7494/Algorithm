import sys
N = int(sys.stdin.readline())
number = list(map(int, sys.stdin.readline().split()))
M = max(number)
count = 0
for i in range(N):
    count += (number.pop())/M*100

print(count/N)