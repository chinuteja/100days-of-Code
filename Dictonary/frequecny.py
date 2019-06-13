import operator
def freq(string):
    frequency = {}
    space = " "
    for i in string:
        if i not in frequency:
            frequency[i] = 1
        else:
            frequency[i] += 1
    if space in frequency:
        del frequency[" "]
    print("word count  ",frequency)
    keys = list(frequency.keys())
    values = list(frequency.values())
    sorted_values = sorted(values,reverse=True)
    # print("keys ",keys)
    # print("values ",values)
    # print("sorted_values",sorted_values)
    for i in sorted_values:
        index = values.index(i)
        # print("index  ",index)
        individual_key = keys[index] 
        string = ""
        for j in range(i):
            string += "*"
        print(individual_key,"---",string)
        keys.remove(individual_key)
        values.remove(i)
        # print("new keys ",keys)

    # print(frequency)
    # key = list(sorted(frequency.keys()))
    # print(key)
    # values = list(frequency.values())
    # new_dict = {} 
    # for key, value in frequency.items(): 
    #     if value in new_dict: 
    #         new_dict[value].append(key) 
    #     else: 
    #         new_dict[value]=[key] 
    # print(new_dict)
    # key = list(sorted(new_dict.keys()))
    # sorted_key = list(sorted(new_dict.keys(),reverse =True))
    # # print(key)
    # values = list(new_dict.values())
    # # print(values)
    # for i in sorted_key:
    #     while len(new_dict[i]) != 0:
    #         val = new_dict[i][0]
    #         string = val + "---"
    #         for j in range(i):
    #             string += "*"
    #         print(string)
    #         # print()
    #         new_dict[i].remove(val)



    # sorted_d = sorted(new_dict.items(), key=operator.itemgetter(1),reverse = True)
    # print(sorted_d)
    # stars = []
    # tup = []
    # for i in sorted_d:
    #     for x in i:
    #         # print("tytoe us",type(x),i)
    #         if type(x) == int:
    #             string = ""
    #             for j in range(x):
    #                 string += "*"
    #             stars.append(string)
    #         else:
    #             tup.append(x)
    # print("stars ",stars)
    # print("tup",tup)


    # new_keys = list(sorted(new_dict,reverse=True))
    # new_values = list(new_dict.values())
    # print("new_keys",new_keys)
    # x = 0
    # # for i in range(new_keys[x]):
        
    # #     for word in new_values:
    # #         # print("word  ",word)
    # #         for w in word:
    # #             # print(w)
    # #             print(w,"-----",string)
    # #     x += 1
    # for word in new_values:
    #     string = ""
    #     for i in range(new_keys[x]):
    #         string = string + "*"
    #     x += 1
    #     for w in word:
    #         print(w,"----",string)

    
def main():
    string = input()
    freq(string)
if __name__ == '__main__':
    main()