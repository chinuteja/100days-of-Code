def fucn(array):
    # array.sort()
    for i in range(len(array)-1):
        if (i+1)%2 == 0:
            if array[i] < array[i+1]:
                temp = array[i]
                array[i] = array[i+1]
                array[i+1] = temp
        else:
            if array[i] > array[i+1]:
                temp = array[i]
                array[i] = array[i+1]
                array[i+1] = temp
    print(array)

def main():
    print("enter size of array")
    n = int(input())
    l = []
    for i in range(n):
        l.append(int(input()))
    fucn(l)
if __name__ == '__main__':
    main()