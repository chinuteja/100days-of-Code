def function(array):
	max_first = -10000000
	max_second = -10000000
	max_third = -10000000
	min_first = 10000000
	min_second = 10000000
	for i in range(len(array)):
		x = array[i]
		if(x > max_first):
			max_third = max_second
			max_second = max_first
			max_first = x
		elif(x > max_second):
			max_third = max_second
			max_second = x
		elif(x>max_third):
			max_third = x
		if(x < min_first):
			min_second = min_first
			min_first = x
		elif(x < min_second):
			min_second = x

	print(max(min_first*min_second*max_first,max_first*max_second*max_third))		


def main():
	array = [ 1, 4, 3, -6, -7, 0 ]
	function(array)
if __name__ == '__main__':
	main()
