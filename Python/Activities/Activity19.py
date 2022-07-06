import pandas
from pandas import ExcelWriter

data={'FirstName':["Satvik", "Avinash", "Lahri"],
      'LastName':["Shah", "Kati", "Rath"],
      'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
      'PhoneNumber':["4537829158", "4892184058", "4528727830"]}

dataframe=pandas.DataFrame(data)
print(dataframe)

writer=ExcelWriter("C:/Users/SunilSubramanian/Desktop/Sample.xlsx")

dataframe.to_excel(writer, 'Shee2', index = False)
writer.save()