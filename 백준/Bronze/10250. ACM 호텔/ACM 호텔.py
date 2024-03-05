T = int(input())

for i in range(T):
    H, W, N = map(int, input().split())
    floor = N % H
    if floor == 0:
      floor = H

    room_number = (N - 1) // H + 1

    
    print(floor * 100 + room_number)