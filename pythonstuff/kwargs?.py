def add(a,b):
    return a + b

print(add(1,2))


def addany(*args):
    sum = 0
    for arg in args:
        sum += arg

    print(sum)

addany(1,2,3,4)
