from multipledispatch import dispatch 
# import mysql.connector
#passing 2 parameter 
@dispatch(int,int) 
def product(first,second): 
	result = first*second 
	print(result); 

#passing three parameters 
@dispatch(int,int,int) 
def product(first,second,third): 
	result = first * second * third 
	print(result); 

#you can also pass data type of any value as per requirement 
@dispatch(float,float,float) 
def product(first,second,third): 
	result = first * second * third 
	print(result); 


#calling product method with 2 arguments 
product(2,4)
product(2,3,2) #this will give output of 12 
product(2.1,3.2,2.4) # this will give output of 17.985999999999997 
