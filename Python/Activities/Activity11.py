"""
Create a Python dictionary that contains a bunch of fruits and their prices.

Write a program that checks if a certain fruit is available or not.
"""

fruit={'apple':100,'orange':165,'mango':65,'grapes':75}
needed_fruit=input("Enter the fruit name to check availability : ")
needed_fruit.lower()
if needed_fruit in fruit:
    print(" Yes, its available")
else:
    print ("No, it's not available")