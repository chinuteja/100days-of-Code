# string = "Hello World"
# if "ello" in string:
# 	print("True")
# else :
# 	print("False")
def main():
	print("enter word")
	word = input()
	string = ""
	print("enter two lines")
	for i in range(2):
		string += input()
	if word in string:
		print("True")
	else:
		print("False")
main()