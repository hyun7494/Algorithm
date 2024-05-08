from collections import deque
deq = deque()
N = int(input())
for i in range(N):
  deq.append(i+1)
# print(deq)

while(len(deq) >1):
    deq.popleft()
    a = deq.popleft()
    deq.append(a)
    
print(deq[0])