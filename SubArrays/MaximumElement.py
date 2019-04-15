def Maximum(arr,size,subsize):
	for i in range(size-subsize+1):
		l = []
		for j in range(i,i+subsize):
			l.append(arr[j])
		print(l)
		print("max elements")
		print(max(l))

def main():
	n = int(input())
	subsize = int(input())
	arr = []
	for i in range(n):
		arr.insert(i,int(input()))
	Maximum(arr,n,subsize)
if __name__ == '__main__':
	main()