"""
Given a two list of numbers create a new list such that new list should
contain only odd numbers from the first list and
even numbers from the second list.
"""
List1=[21,43,66,12,47,88]
List2=[22,55,75,13,44,64,98]
List3=[]
for num in List1:
   if num %2 !=0:
      List3.append(num)
for num in List2:
   if num % 2==0:
       List3.append(num)

print("The new list is : ",List3)






