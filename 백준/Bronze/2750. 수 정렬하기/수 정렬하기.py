N = int(input())
n = []

for i in range(N):
    i = int(input())
    n.append(i)
n = sorted(n)

for j in range(N):
    print(n[j])