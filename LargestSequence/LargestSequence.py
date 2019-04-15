def sequence(array):
	max_so_far =0
	max_ending_here = 0
	for i in range(len(array)):
		max_ending_here = max_ending_here + array[i]
		if max_ending_here < 0:
			max_ending_here = 0
		elif max_so_far < max_ending_here:
			max_so_far = max_ending_here
	print(max_so_far)
def main():
	print("enter no of elements")
	n = int(input())
	array = []
	print("enter elements")
	for i in range(n):
		array.insert(i,int(input()))
	sequence(array)
if __name__ == '__main__':
	main()
