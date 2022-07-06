"""
Given a list of numbers, return True if first and last number of a list is same.
Bonus points if you can make the user enter their own list.

"""

from pandas.core.arrays import boolean
while True:
    given_number=list(input("Enter a list :"))
    print (given_number)
    first=given_number[0]
    last=given_number[-1]

    if first==last:
        print(True)
    else:
        print (False)
    user_input=str(input("Do you want to enter another list : (yes/no)"))
    print(user_input)
    if user_input=="yes":
        pass
    elif user_input=="no":
       raise SystemExit
    else:
        print("you have enterd wrong option")