#include <stdio.h>

unsigned int fibonacciInt(unsigned int n) {

    if (n <= 1) 
        return 1;

    unsigned int fib = 1;
    unsigned int prevFib = 1;

    for (unsigned int i = 2; i < n; i++) {

        unsigned int temp = fib;
        fib += prevFib;
        prevFib = temp;

    }

    return fib;

}

unsigned long int fibonacciLongInt(unsigned long int n) {

    if (n <= 1) 
        return 1;

    unsigned long int fib = 1;
    unsigned long int prevFib = 1;

    for (unsigned long int i = 2; i < n; i++) {

        unsigned long int temp = fib;
        fib += prevFib;
        prevFib = temp;

    }

    return fib;

}


unsigned long long int fibonacciLongLongInt(unsigned long long int n) {

    if (n <= 1) 
        return 1;

    unsigned long long int fib = 1;
    unsigned long long int prevFib = 1;

    for (unsigned long long int i = 2; i < n; i++) {

        unsigned long long int temp = fib;
        fib += prevFib;
        prevFib = temp;

    }

    return fib;

}

void main () {
	printf("Con Int\n");
    printf("%u\n", fibonacciInt(6));
	printf("%u\n", fibonacciInt(7));
	printf("%u\n", fibonacciInt(8));
	printf("%u\n", fibonacciInt(47));
	printf("Overflow en 48\n\n");
	
	printf("Con LongInt\n");
	printf("%lu\n", fibonacciLongInt(6));
	printf("%lu\n", fibonacciLongInt(7));
	printf("%lu\n", fibonacciLongInt(8));
	printf("%lu\n", fibonacciLongInt(93));
	printf("Overflow en 94\n\n");

	printf("Con LongLongInt\n");
	printf("%llu\n", fibonacciLongLongInt(6));
	printf("%llu\n", fibonacciLongLongInt(7));
	printf("%llu\n", fibonacciLongLongInt(8));
	printf("%llu\n", fibonacciLongLongInt(94));
	printf("Overflow en 94\n\n");    
}