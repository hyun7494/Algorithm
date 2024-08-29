import sys
N = int(input())
lst = []
for i in range(N):
    a = sys.stdin.readline().strip()
    lst.append(a)
lst = list(set(lst))
lst.sort()
lst.sort(key=len)
for i in lst:
    print(i)