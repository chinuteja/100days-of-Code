def equlibrium(array,n):
	if n == 1 or n == 2:
		print(n)
		return
	if n == 3:
		if array[0] == array[2]:
			print(array[1])
			return
	return
	
	for i in range(1,n):
		leftsum = 0
		rightsum = 0
		for j in range(i):
			leftsum += array[j]
			# print("leftsum  ",leftsum)
		for k in range(i+1,n):
			rightsum += array[k]
			# print("rightsum ",rightsum)
		if leftsum == rightsum:
			print("equlibrium point")
			print(i)
			break

def main():
	n = int(input())
	array = []
	for i in range(n):
		array.insert(i,int(input()))
	equlibrium(array,n)
if __name__ == '__main__':
	main()