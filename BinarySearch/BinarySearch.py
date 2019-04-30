def binary(array,left,right,element):
    # print("hello")
    
    # print("array  ",array)
    if right >=1:
        mid = left + (right - left)//2
        if array[mid] == element:
            return "element is found"
        elif array[mid] > element:
            return binary(array,mid+1,right,element)
        else:
            return binary(array,left,mid-1,element)
    else:
        return "element is not found"
def main():
    print("enter no of elements")
    n = int(input())
    l = []
    print("enter elements")
    for i in range(n):
        l.insert(i,int(input()))
    print("enter element to be searched")
    element = int(input())
    l.sort()
    print(binary(l,0,len(l)-1,element))
if __name__ == '__main__':
    main()