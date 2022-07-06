# Import pandas
import pandas

# Read data from Excel sheet
dataframe = pandas.read_excel("C:/Users/SunilSubramanian/Desktop/Sample.xlsx")


print(dataframe)


print("====================================")
print("Number of rows and columns:", dataframe.shape)


print("====================================")
print("Emails:")
print(dataframe['Email'])

# Sort the data based on FirstName in ascending order and print the data
print("====================================")
print("Sorted data:")
print(dataframe.sort_values('FirstName'))