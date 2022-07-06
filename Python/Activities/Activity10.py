"""
Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

Bonus points if you can make the user enter their own tuple
"""


#number_tuple=tuple(input(" Enter your tuple : "))
number_tuple=(10,13,56,50,20)
print(number_tuple)
new_tuple=()
for num in number_tuple:
    if (num%5 == 0):
        print(num)
