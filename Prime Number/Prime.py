def isPrime(n):
	if n <=1:
		return False
	# print("n values is  ",n)
	for i in range(2,n):
		# print("values  ",i)
		if n%i == 0:
			return False
	return True
def PrimeNumber(n):
	for i in range(2,n+1):
		# print("i value ",i)
		if isPrime(i):
			print(i)
def main():
	print("enter number")
	n = int(input())
	PrimeNumber(n)
if __name__ == '__main__':
	main()