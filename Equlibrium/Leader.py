def Leader(array,n):
    lastindex = len(array) -1
    for i in range(n):
        element = array[i]
        count = 0
        for j in range(i+1,n):
            if element > array[j]:
                # print(" element  ",element)
                count += 1
                # print("count is ",count)
            if count == lastindex - i:
                print("Leader is  ",array[i] ,"In position ",i)
    print("Leader is  ",array[lastindex] ,"In position ",lastindex)





def main():
    n = int(input())
    l = []
    for i in range(n):
        l.insert(i,int(input()))
    Leader(l,n)
if __name__ == '__main__':
    main()
