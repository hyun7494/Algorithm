N = int(input())
lst2 = []
for i in range(N):
    lst1 = []
    x,y = map(int,input().split())
    lst1.append(x)
    lst1.append(y)
    lst2.append(lst1)
lst2.sort()
lst2.reverse()
for i in range(N):
    lst3 = lst2.pop()
    print(lst3[0],lst3[1])