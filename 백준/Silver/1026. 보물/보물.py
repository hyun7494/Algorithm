import sys
N = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))

A = a.sort()
B = b.sort(reverse=True)

count = 0
for i in range(N):
    count += a[i]*b[i]

print(count)