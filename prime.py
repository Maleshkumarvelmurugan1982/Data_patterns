x = int(input())
num = x + 1
while True:
    isPrime = True
    for i in range(2, num):
        if num % i == 0:
            isPrime = False
            break
    if isPrime:
        print(num)
        break
    num += 1
