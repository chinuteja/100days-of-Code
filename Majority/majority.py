def majority(array):
	freq = {}
	for ele in array:
		if ele not in freq:
			freq[ele] = 1
		else:
			freq[ele] += 1
	# print(freq)
	values = list(freq.values())
	keys = list(freq.keys())
	maxval = max(values)
	indexofmaxkey = values.index(maxval)
	print(keys[indexofmaxkey])
def main():
	testcases = int(input())
	for i in range(testcases):
		length = (int(input()))
		array = []
		line = input()
		line = line.split(" ")
		for j in range(len(line)):
			array.append(int(line[j]))
		majority(array)
if __name__ == '__main__':
	main()