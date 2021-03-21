a = 1
def sub1():
    print(a)
    def sub2():
        b = 1
        # var "b" can be any variable and the result will still be 1
        def sub3():
          nonlocal b
          print(b)
    sub2()
sub1()
