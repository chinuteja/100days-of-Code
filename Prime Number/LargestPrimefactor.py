# def func(number):
#     factors = []
#     for i in range(1,number+1):
#         if number%i == 0:
#             factors.append(i)
#     # print(factors)
#     return prime(factors)
# def isPrime(n):
#     if n <=1:
#         return False
#     # print("n values is  ",n)
#     for i in range(2,n):
#         # print("values  ",i)
#         if n%i == 0:
#             return False
#     return True
# def prime(factors_array):
#     largest_prime = []
#     for i in factors_array:
#         if isPrime(i):
#             largest_prime.append(i)
#     return largest_prime
# def main():
#     n = int(input())
#     for i in range(n):
#         number = int(input())
#         alpha = func(number)
#         print(max(alpha))
# if __name__ == '__main__':
#     main()
T = int(input())
for z in range(T):
    N = int(input())
    i = 2
    largest_prime = 2
    while i*i <= N:
        while N % i == 0:
            largest_prime = i
            N //= i    
        i += 1
    if N>largest_prime:
        largest_prime = N;
    print(largest_prime)