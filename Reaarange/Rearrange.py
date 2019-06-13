def rearrange(arr,n):
    max_idx = n - 1
    min_idx = 0
  
    # Store maximum element of array 
    max_elem = arr[n-1] + 1
  
    # Traverse array elements 
    for i in range(0, n) : 
  
        # At even index : we have to put maximum element 
        if i % 2 == 0 : 
            arr[i] += (arr[max_idx] % max_elem ) * max_elem 
            # print("even ",arr)
            max_idx -= 1
  
        # At odd index : we have to put minimum element 
        else : 
            arr[i] += (arr[min_idx] % max_elem ) * max_elem 
            # print("odd ",arr)
            min_idx += 1
  
    # array elements back to it's original form 
    print(arr)
    for i in range(0, n) : 
        arr[i] = arr[i] // max_elem
    print(arr) 
def main():
    n = int(input())
    l = []
    for i in range(n):
        l.append(int(input()))
    rearrange(l,n)
if __name__ == '__main__':
    main()