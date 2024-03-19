import sys
N = int(sys.stdin.readline())
number = 1
count = 0
while True:
    if "666" in str(number):
        count += 1
    if count == N:
        print(number)
        break
    number += 1