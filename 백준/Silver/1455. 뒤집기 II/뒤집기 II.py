N, M = map(int, input().split())
lst = []
for x in range(N):
    tmp = []
    for i in input():
        tmp.append(i)
    tmp = list(map(int, tmp))
    lst.append(tmp)
count = 0
for i in range(N - 1, -1, -1):
    for j in range(M - 1, -1, -1):
        if lst[i][j]:
            count += 1
            for k in range(i + 1):
                for l in range(j + 1):
                    if lst[k][l] == 1:
                        lst[k][l] = 0
                    else:
                        lst[k][l] = 1
print(count)