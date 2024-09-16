import math

a, o, c = input().split()
a = int(a)
c = int(c)

if o == "+":
    print(a, "+", c, "=", a+c)
elif o == "-":
    print(a, "-", c, "=", a-c)
elif o == "*":
    print(a, "*", c, "=", a*c)
elif o == "/":
    print(a, "/", c, "=", math.floor(a/c))
else:
    print("False")