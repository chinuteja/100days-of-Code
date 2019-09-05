"""
Given an array of integers, and a number ‘sum’, 
find the number of pairs of integers in the array whose sum is equal to ‘sum’.
Input  :  arr[] = {1, 5, 7, -1}, 
          sum = 6
Output :  2
Pairs with sum 6 are (1, 5) and (7, -1)
"""
def function(array,sum_):
	dic = {}
	for i in array:
		if i not in dic:
			dic[i] = 1
		else:
			# temp = dic[i]
			dic[i] += 1
	twice_count = 0
	for i in range(len(array)):
		if(dic[sum_ - array[i]] != None ):
			twice_count += dic[sum_-array[i]]
		if(sum_ - array[i] == array[i]):
			twice_count -= 1
	print(twice_count//2)
def main():
	n = int(input())
	array = []
	for i in range(n):
		array.append(int(input()))
	sum_ = int(input())
	function(array,sum_)
if __name__ == '__main__':
	main()