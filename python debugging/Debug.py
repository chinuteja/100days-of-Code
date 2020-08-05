# import pdb

# def seq(n):
# 	for i in range(n):
# 		pdb.set_trace()
# 		print(i)
# 	return
# seq(5)
# 
'''
example of lambda 
'''
g = lambda x : x**3
print(g(7))
"""
map function takes iteralbe sequences and funciton as parmeters
it returns a map object
"""
l = [1,2,3,4]
output = list(map(lambda x:x+3,l))
print(output)
"""
another example for map
"""
def new(a):
	return a+3
output = list(map(new,l))
print(output)
"""
final example
"""
print("taking two lists as an argument")
def new_1(a,b):
	return a*b
output = list(map(new_1,[1,2,3,4],[1,2,3,4]))
print(output)
"""
filter function is used to create an output list consisting of values
for which function returns true
"""
print("filter function")
# here the function should have a condition
output = list(filter(lambda x:x>3,[2,4,5,6,1]))
print(output)
"""
another example
"""
def func(a):
	if a>3:
		return a
output = list(filter(func,[2,4,5,6,1]))
print(output)

"""
reduce function applies the given function to iterables and returns a single value
"""
print("example of reduce function")
from functools import reduce
def function(x,y):
	"""
	here x is the first element y is second element and both gets added and stored in x
	then y will be third element and gets added to the element in x
	"""
	return x+y
output = reduce(function,[1,2,3,4,5,6,7])
print(output)
"""
another example
"""
output = reduce(lambda p,q:p*q,[1,2,3,4])
print(output)

"""
example for zip
"""
# Python code to demonstrate the working of 
# zip() 

# initializing lists 
name = [ "Manjeet", "Nikhil", "Shambhavi", "Astha" ] 
roll_no = [ 4, 1, 3, 2 ] 
marks = [ 40, 50, 60, 70 ] 

# using zip() to map values 
mapped = zip(name, roll_no, marks) 

# converting values to print as set 
# mapped = set(mapped) 

# printing resultant values 
print ("The zipped result is : ",end="") 
print (list(mapped) )
mapped = list(mapped)
"""
lets see unzipping
"""
# Python code to demonstrate the working of 
# unzip 

# initializing lists 

name = [ "Manjeet", "Nikhil", "Shambhavi", "Astha" ] 
roll_no = [ 4, 1, 3, 2 ] 
marks = [ 40, 50, 60, 70 ] 

# using zip() to map values 
mapped = zip(name, roll_no, marks) 

# converting values to print as list 
mapped = list(mapped) 

# printing resultant values 
print ("The zipped result is : ",end="") 
print (mapped) 

print("\n") 

# unzipping values 
namz, roll_noz, marksz = zip(*mapped) 

print ("The unzipped result: \n",end="") 

# printing initial lists 
print ("The name list is : ",end="") 
print (namz) 

print ("The roll_no list is : ",end="") 
print (roll_noz) 

print ("The marks list is : ",end="") 
print (marksz) 
