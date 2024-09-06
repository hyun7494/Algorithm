import sys

n = int(sys.stdin.readline())


def test(n):
    for i in range(n):
        a = list(map(int,sys.stdin.readline().split()))
        num = int(a.pop(0))
        total = sum(a)
        avg = total / num
        count = 0
        for j in a:
            if j > avg:
                count +=1
        result = count/num
        print(f"{result:.3%}")

test(n)