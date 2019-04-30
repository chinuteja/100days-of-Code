def Rounding(n):
	a = (n//10)*10
	b = a + 10
	if n - a > b - n:
		return b
	else:
		return a
def main():
	print("enter a number")
	n = int(input())
	print(Rounding(n))
main()