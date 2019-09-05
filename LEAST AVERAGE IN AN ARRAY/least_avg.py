"""
Input:  arr[] = {3, 7, 5, 20, -10, 0, 12}, k = 2
Output: Subarray between [4, 5] has minimum average
"""
def func(array,k,n):
    current_sum = 0
    result_index = 0
    for i in range(k):
        current_sum += array[i]
    min_sum = current_sum
    for i in range(k,n):
        current_sum += array[i] - array[i-k]
        if(current_sum < min_sum):
            min_sum = current_sum
            result_index = i  - k + 1
    print(result_index," ",result_index+k-1)     

def main():
    n = int(input())
    array = []
    for i in range(n):
        array.append(int(input()))
    k = int(input())
    func(array,k,n)
if __name__ == '__main__':
    main()