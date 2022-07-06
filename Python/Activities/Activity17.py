import pandas

data={"username":['admin','charles','Deku'],"Password":['password','charl13','Allmight']}

dataframe=pandas.DataFrame(data)
print(dataframe)

dataframe.to_csv("C:/Users/SunilSubramanian/Desktop/Sample.csv", index=False)