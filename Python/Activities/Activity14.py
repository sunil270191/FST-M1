def fib(n):
    if n<=1:
        return n
    else:
        return (fib(n-1)+fib(n-2))
number= int(input('enter the interm : '))
if number<=0:
    print (' Please enter the valid number ')
else:
    print("The fib sequence is")
    for i in range(number):
        print(fib(i))
