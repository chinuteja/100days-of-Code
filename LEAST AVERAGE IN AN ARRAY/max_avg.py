"""
Input:  arr[] = {1, 12, -5, -6, 50, 3}, k = 4
Output: Maximum average subarray of length 4 begins
        at index 1.
"""
def func(array,k,n):
    current_sum = 0
    result_index = 0
    for i in range(k):
        current_sum += array[i]
    max_sum = current_sum
    for i in range(k,n):
        current_sum += array[i] - array[i-k]
        if(current_sum > max_sum):
            max_sum = current_sum
            result_index = i
    print("begins at",result_index -k +1)
    print("end at ",result_index)

def main():
    n = int(input())
    array = []
    for i in range(n):
        array.append(int(input()))
    k = int(input())
    func(array,k,n)
if __name__ == '__main__':
    main()