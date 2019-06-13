def function(array,size,subsize):
	current_sum = 0
	req_index = 0
	for i in range(size):
		current_sum += array[i]
	minimum_sum = current_sum
	for i in range(subsize,size):
		current_sum += array[i] - array[i-subsize]
		if current_sum < minimum_sum:
			minimum_sum = current_sum
			req_index = i - subsize + 1
	print(req_index," ",(req_index+subsize-1))

def main():
	size = int(input())
	array = []
	for i in range(size):
		array.append(int(input()))
	subsize = int(input())
	function(array,size,subsize)
if __name__ == '__main__':
	main()