def func(l):
	dic = {}
	for i in l:
		if i not in dic:
			dic[i] = 1
		else:
			dic[i] += 1
	keys_list = (list(dic.keys()))
	values_list = list(dic.values())
	max_val = max(values_list)
	index = values_list.index(max_val)
	print(keys_list[index])
def main():
	n = int(input())
	l = []
	for i in range(n):
		l.append(int(input()))
	func(l)
if __name__ == '__main__':
	main()