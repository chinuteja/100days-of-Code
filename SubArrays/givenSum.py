# def func(list1,givensum):
# 	length = len(list1)
# 	for i in range(length):
# 		current_sum = list1[i]
# 		print("before second loop ",current_sum)
# 		# j = i + 1
# 		for j in range(i+1,length):
# 			# print("value of j",j)
# 			if current_sum == givensum:
# 				print(i+1,j)
# 			elif current_sum > givensum:
# 				print("after break ",current_sum)
# 				break
# 			else:
# 				current_sum += list1[j]
# 				print("current_sum ",current_sum)


# def main():
# 	nooftestcases = int(input())
# 	for i in range(nooftestcases):
# 		line = input().split(" ")
# 		tokens = input().split(" ")
# 		list1 = []
# 		for i in range(len(tokens)):
# 			list1.insert(i,int(tokens[i]))
# 		givensum = int(line[1])
# 		func(list1,givensum)
# if __name__ == '__main__':
# 	main()
# using map we will solve the above problem
def func(list1,givensum):
	dic = {}
	current_sum = 0
	for i in range(len(list1)):
		current_sum += list1[i]
		if current_sum == givensum:
			print(0,i)
			break
		if current_sum - givensum in dic:
			print(dic[current_sum - givensum] , i)
			break
		dic[current_sum] = i 
def main():
	nooftestcases = int(input())
	for i in range(nooftestcases):
		line = input().split(" ")
		tokens = input().split(" ")
		list1 = []
		for i in range(len(tokens)):
			list1.insert(i,int(tokens[i]))
		givensum = int(line[1])
		func(list1,givensum)
if __name__ == '__main__':
	main()
