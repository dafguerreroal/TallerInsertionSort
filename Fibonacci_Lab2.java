import java.math.BigInteger;

class Fibo {
	/*
	public Fibo() {
		// TODO Auto-generated constructor stub
	}
	*/
	
	static class Fibonacci {
		public int fibonacciIterativeInt(int n) {
			if(n <= 1) {
				return n;
			}
			int fib = 1;
			int prevFib = 1;
			
			for(int i=2; i<n; i++) {
				int temp = fib;
				fib+= prevFib;
				prevFib = temp;
			}
			return fib;
		}
		
		public long fibonacciIterativeLong(long n) {
			if(n <= 1) {
				return n;
			}
			long fib = 1;
			long prevFib = 1;
			
			for(long i=2; i<n; i++) {
				long temp = fib;
				fib+= prevFib;
				prevFib = temp;
			}
			return fib;
		}
		
		public BigInteger fibonacciIterativeBigInt(int n) {
			if(n <= 1) {
				System.out.println(n);
			}
			
			BigInteger fib = new BigInteger("1");
			BigInteger prevFib = new BigInteger("1");
			
			for(int i=2; i<n; i++) {
				BigInteger temp = fib;
				fib = fib.add(prevFib);
				prevFib = temp;
			}
			return fib;
		}
	}
	
	public static void main(String[] args) {
		//Fibo fib = new Fibo();
		Fibonacci fib = new Fibonacci(); 
		
		System.out.println("Iterative version:");
		
		System.out.println("\nInt:");
		System.out.println(fib.fibonacciIterativeInt(5));
		System.out.println(fib.fibonacciIterativeInt(6));
		System.out.println(fib.fibonacciIterativeInt(7));
		System.out.println(fib.fibonacciIterativeInt(8));
		System.out.println(fib.fibonacciIterativeInt(46));
		System.out.println("Overflow en 47");
		
		System.out.println("\nLong:");
		System.out.println(fib.fibonacciIterativeLong(5));
		System.out.println(fib.fibonacciIterativeLong(46));
		System.out.println(fib.fibonacciIterativeLong(47));
		System.out.println(fib.fibonacciIterativeLong(92));
		System.out.println("Overflow en 93");
		
		System.out.println("\nBigInt:");
		System.out.println(fib.fibonacciIterativeBigInt(5));
		System.out.println(fib.fibonacciIterativeBigInt(46));
		System.out.println(fib.fibonacciIterativeBigInt(47));
		System.out.println(fib.fibonacciIterativeBigInt(92));
		System.out.println(fib.fibonacciIterativeBigInt(19591));
		System.out.println("Overflow en 19592");
	}

}