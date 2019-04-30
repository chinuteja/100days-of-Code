def rotate_left3(nums):
  l = []
  i = 0
  n = len(nums) -1
  # print("length ,",n)
  # print(nums[2])
  while (n >= 0):
    # print("nums ",nums[n])
    # print("l",l[0])
    l[i] = nums[n]
    i +=1
    n -=1
  return l
def main():
    print(rotate_left3([1,2,3]))
if __name__ == '__main__':
    main()