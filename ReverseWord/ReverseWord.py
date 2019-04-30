def revword(word):
    word = word.split(" ")
    string1 = ""
    # print(word)
    i = len(word) - 1
    while i >= 0:
        string1 += word[i] + " "
        i = i - 1

    return string1

def main():
    input1= input()
    print(revword(input1))
main()