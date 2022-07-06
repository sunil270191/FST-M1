"""
Write a Python program to calculate the sum of all the elements in a list.

Bonus points if you can make the user enter their own list.
"""

number=list(input("Entaer the values for list : "))
#numbers= number
print(number)
sum=0

for num in number:
    sum+= int(num)

print("Over all",sum)




