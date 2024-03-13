while True:
    N = input()
    if N == "0":
        break
    else:
        n = list(N)
        # print(n)
        # print(len(n))
        if len(n) == 1:
            print('yes')
        elif len(n) == 3:
            if n[0] == n[2]:
                print("yes")
            else:
                print("no")
        elif len(n) == 5:
            if n[0] == n[4] and n[1] == n[3]:
                print("yes")
            else:
                print("no")
        if len(n) == 2:
            if n[0] == n[1]:
                print("yes")
            else:
                print("no")
        elif len(n) == 4:
            if n[0] == n[3] and n[1] == n[2]:
                print("yes")
            else:
                print("no")