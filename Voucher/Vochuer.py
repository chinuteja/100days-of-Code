from datetime import date
def vocher(l):
    voucher = []
    cardnumber = []
    for tokens in l:
        # print("tokens ",tokens)
        str2 = ""
        if len(tokens) != 5:
            # print("len")
            str2 = str2+tokens[0]+"," + "N/A"
            cardnumber.append(int(tokens[0]))
            voucher.append(str2)
            
            # return
        datetokens = tokens[3].split("-")
        year = int(datetokens[0])
        month = int(datetokens[1])
        day = int(datetokens[2])
        d0 = date(2019, 4, 12)
        d1 = date(year, month, day)
        delta = d1 - d0
        if delta.days > 89 or int(tokens[4]) != 0:
            # print("0")
            # str2 = str2+tokens[0]+"," + "N/A"
            str2 += "N/A"
            cardnumber.append(int(tokens[0]))
            voucher.append(str2)
            
            # return
        else:
            sum2 = 0
            sum2 = sum2 + singleDigit(year) + singleDigit(month) + singleDigit(day)
            V9 = singleDigit(sum2)
            # print("sum2 ",V9)
            alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            amountspend = float(tokens[2])
            Code = ""
            V1= ""
            if amountspend >= 100000:
                V1 = V1 + "F"
            elif amountspend >= 50000 and amountspend < 100000:
                V1 = V1 + "H"
            elif amountspend >= 25000 and amountspend < 50000:
                V1 = V1 + "S"
            amount = (tokens[2])
            sum1 = 0
            for i in amount:
                if i != ".":
                    sum1 += int(i)


            # sum1 = 0
            # print("amount ",amount)
            # while amount != 0:
            #     temp = amount %10
            #     sum1 = sum1 + temp
            #     amount = amount//10
            #     print("sum1  ",sum1)
            V7 = singleDigit(sum1)
            # print("sum1 ",V7)
            
            
            # while year != 0:
            #     temp = year%10
            #     sum2 = sum2 + temp
            #     year = year//10
            # while month != 0 :
            #     temp = month%10
            #     sum2 = sum2 + temp
            #     month = month//10
            
            name = tokens[1].split(" ")
            firstname = name[0]
            lastname = name[1]
            firstname_firstletter = firstname[0]
            lastname_firstletter = lastname[0]
            indexoffirstletter_firstname = alpha.index(firstname_firstletter)
            # print("indexoffirstletter_firstname",indexoffirstletter_firstname)
            indexoffirstletter_lastname = alpha.index(lastname_firstletter)
            V3 = alpha[26 - indexoffirstletter_firstname -1]
            V5 = alpha[26-indexoffirstletter_lastname-1]
            number = tokens[0]
            number1 = int(number[0:5])
            number1 = str(99999 - number1)
            number1 = number1[::-1]
            V2 = number1[0]
            V4 = number1[1]
            V6 = number1[2]
            V8 = number1[3]
            V10 = number1[4]
            # print("number1 ",number1)
            # print("V6  ",V6)
            # print("V7",V7).
            str1 = int(tokens[0])
            cardnumber.append(str1)
            x = V1+V2+V3+V4+V5+V6+str(V7)+V8+str(V9)+V10
            voucher.append(x)
    # print("voucher ",voucher)
    for i in sorted(cardnumber):
        beta = voucher[cardnumber.index(i)]
        # print("beta ",beta)
        str3 = ""
        str3 += str(i) + ","+beta
        print(str3)
            # print(str1)
def singleDigit(digit):
    sum1 = 0
    while(digit > 0 or sum1 > 9):
        if digit == 0:
            digit  = sum1
            sum1 = 0
        sum1 += digit%10
        digit = digit // 10
    return sum1

def main():
    N = int(input())
    l = []
    for i in range(N):
        input1 = str(input())
        tokens = input1.split(",")
        l.append(tokens)
    vocher(l)
if __name__ == '__main__':
    main()