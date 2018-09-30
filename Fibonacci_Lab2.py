def fibonacci(n):
    
    if n <= 1:
        return 1
    
    fib = 1
    prevFib = 1
    
    for i in range(2, n):
        temp = fib
        fib += prevFib
        prevFib = temp
    
    return fib

print(fibonacci(100))