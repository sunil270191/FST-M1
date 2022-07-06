import pandas
dataframe=pandas.read_csv("C:/Users/SunilSubramanian/Desktop/Sample.csv")
print(" Full data")
print(dataframe)
print("-----------------------")
print("Username : ")
print(dataframe["username"])
print("*************************")

print(dataframe["username"][1],dataframe["Password"][1])

print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('username'))

#Sort the Passwords column in descending order
print("====================================")
print("Data sorted in descending Password:")
print(dataframe.sort_values('Password', ascending=False))