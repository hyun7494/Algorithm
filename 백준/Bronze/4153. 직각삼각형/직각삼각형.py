while True: 
  A,B,C = input().split()
  a = int(A)
  b = int(B)
  c = int(C)
  if a==0 and b==0 and c==0:
    break
  elif a*a + b*b == c*c or b*b + c*c == a*a or c*c + a*a == b*b:
    print('right')
  else:
    print('wrong')