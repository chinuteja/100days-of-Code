import mysql.connector

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="12345",
  database = "mydatabase"
)

mycursor = mydb.cursor()
# to create data base
# mycursor.execute("CREATE DATABASE mydatabase")
# to check the data bases 
mycursor.execute("SHOW DATABASES")
for x in mycursor:
  print(x) 