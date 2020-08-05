name = [ "Manjeet", "Nikhil", "Shambhavi", "Astha" ] 
roll_no = [ 4, 1, 3, 2 ] 
marks = [ 40, 50, 60, 70 ] 

# using zip() to map values 
mapped = zip(name, roll_no, marks) 
mapped = list(mapped)
print("zipped items ",end = "")
print(mapped)

# unziping
name_,roll_no_,marks_ = zip(*mapped)
print("result of unzipped")
print(name_)
print(roll_no_)
print(marks_)