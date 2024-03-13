# while True:
#     N = input()
#     if N == "0":
#         break
#     else:
#         n = list(N)
#         # print(n)
#         # print(len(n))
#         if len(n) == 1:
#             print('yes')
#         elif len(n) == 3:
#             if n[0] == n[2]:
#                 print("yes")
#             else:
#                 print("no")
#         elif len(n) == 5:
#             if n[0] == n[4] and n[1] == n[3]:
#                 print("yes")
#             else:
#                 print("no")
#         if len(n) == 2:
#             if n[0] == n[1]:
#                 print("yes")
#             else:
#                 print("no")
#         elif len(n) == 4:
#             if n[0] == n[3] and n[1] == n[2]:
#                 print("yes")
#             else:
#                 print("no")
# 쌩 노가다 했는데 파이썬은 다른방법 있음
while True:
    input_num = input()
    
    if input_num == "0":
        break
    
    answer = "no"

    if input_num == input_num[::-1]:
        answer = "yes"
    
    print(answer)
