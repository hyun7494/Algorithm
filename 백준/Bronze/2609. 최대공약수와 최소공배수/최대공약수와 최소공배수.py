import sys
a,b = sys.stdin.readline().rsplit()
A = int(a)
B = int(b)

small = min(A,B)
big = max(A,B)
#
for i in range(1, small+1):
    if small % i == 0 and big % i == 0:
        최대공약수 = i
print(최대공약수)
작은수남는값 = int(small / 최대공약수)
큰수남는값 = int(big / 최대공약수)

최소공배수 = 작은수남는값 * 큰수남는값 * 최대공약수
print(최소공배수)