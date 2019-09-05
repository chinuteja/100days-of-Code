def func(string):
    test_list = []
    alpha = 'a'
    for i in range(0, 26): 
        test_list.append(alpha) 
        alpha = chr(ord(alpha) + 1)
    # print(test_list)
    stri = ""
    for i in range(len(string)):
        if string[i] == "?":
            for j in test_list:
                if string[i-1] != j and string[i+1] != j:
                    






def main():
    string = (input())
    func(string)
if __name__ == '__main__':
    main()