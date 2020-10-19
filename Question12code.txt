import sys
sys.stdin = open ('Tekashi6969HeLlOWrLd.txt', 'r')
string = " "
arr = [string]
for isString in sys.stdin:
    for mulString in isString:
        if string.isalnum == True:
           string = string * mulString
        else:
          if len(string) != 0:
             arr.append(string)
          if mulString != string and string != "\n" and string != ",":
             arr.append(mulString)
          string = " "
print (isString)
