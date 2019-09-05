def Seive(n):
	prime = [True] * (n+1)
	# for i in range(n+1):
	# 	prime.insert(i,True)
	p = 2
	while(p*p <= n):
		if(prime[p] == True):
			for i in range(p*p,n+1,p):
				prime[i] = False
		p += 1
	for i in range(2,n):
		if prime[i]:
			print(i)
def main():
	print("Enter a number")
	n = int(input())
	Seive(n)
if __name__ == '__main__':
	main()