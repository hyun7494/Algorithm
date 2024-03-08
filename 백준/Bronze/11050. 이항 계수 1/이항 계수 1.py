from sys import stdin
def facto(n):
    if n == 0:
        return 1
    result = 1
    for i in range(1, n+1):
        result *= i
    return result


n, k = map(int, stdin.readline().split())
print(facto(n) // (facto(k) * facto(n-k)))