# def array_of_array_products(arr):
#   n = len(arr)
#   l = []
#   for i in range(n):
#     prod = 1
#     for j in range(n):
#       if i == j:
#         continue
#       else :
#         prod = prod * arr[j] 
#     # prod = prod//arr[i]
#     l.append(prod)
#   return l
  
  
# def main():
#   n = int(input())
#   array = []
#   for i in range(n):
#     array.insert(i,int(input()))
#   print(array_of_array_products(array))
# main()
def arrayofproducts(array):
  output = []
  prod = 1
  for i in range(len(array)):
    prod *= array[i]
  for i in array:
    output.append(prod//i)
  return output

def main():
  n = int(input())
  array = []
  for i in range(n):
    array.insert(i,int(input()))
  print(arrayofproducts(array))
if __name__ == '__main__':
  main()