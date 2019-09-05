def Nthprime(n):
	number_prime_to_find = n
	x = 3
	list_primes = [2]
	while(len(list_primes) < number_prime_to_find):
		if all(x%prime for prime in list_primes):
			list_primes.append(x)
		x += 2
	# print(list_primes)
	print(list_primes[-1])


def main():
	n = int(input())
	Nthprime(n)
if __name__ == '__main__':
	main()