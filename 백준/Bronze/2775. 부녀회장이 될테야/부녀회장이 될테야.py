import sys
T = int(sys.stdin.readline())
a = 0
people = []

for i in range(T):
    k = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    people = [i for i in range(1, n+1)]
    # 0층 기준

    for K in range(k):
        for N in range(1, n):
            people[N] += people[N-1]
    print(people[-1])
