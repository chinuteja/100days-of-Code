def function(first_array,second_array):
	count = 0
	for x in first_array:
		for y in second_array:
			if x**y > y**x:
				count = count+ 1
	print(count)

def main():
	for i in range(int(input())):
		first_line = input()
		second_line = input()
		third_line = input()
		first_array = []
		second_array = []
		second_line = second_line.split(" ")
		third_line = third_line.split(" ")
		for ele in second_line:
			first_array.append(int(ele))
		for ele in third_line:
			second_array.append(int(ele))
		# print(first_array)
		# print(second_array)
		function(first_array,second_array)
if __name__ == '__main__':
	main()