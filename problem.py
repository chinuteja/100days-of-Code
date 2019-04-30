def func(array,first_index,second_index):
	array1 = array[first_index:second_index]
	# maximum = max(array1)
	# minimum = min(array1)
	# print(maximum)
	# print(minimum)
	array1.sort()
	print(array1)
	print(array1[len(array1) - 1])
	print(array1[0])

def main():
	n = int(input())
	l = []
	for i in range(n):
		l.append(int(input()))
	print("enter i and j")
	first_index = int(input())
	second_index = int(input())
	func(l,first_index,second_index)
main()
