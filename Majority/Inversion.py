def inversion(array):
    # print("hello")
    maxelement = array[len(array)-1]
    j = len(array)-2
    count = 0
    while j>=0:
        
        # print("array",array[j])
        if array[j] > maxelement:
            maxelement = array[j]
            count += 1
        j = j - 1
    print(count)
def main():
    # print("enter no of testcases")
    testcases = int(input())
    for i in range(testcases):
        length = (int(input()))
        array = []
        line = input()
        line = line.split(" ")
        for j in range(len(line)):
            array.append(int(line[j]))
        # print("array",array)
        inversion(array)
main()