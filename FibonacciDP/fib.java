public class fib {
	
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		
		System.out.println(fibonacci(i));
	}
	
	private static long fibonacci(int n) {
		if(n < 3) {
			return 1;
		}
		
		long a = 1;
		long b = 1;
		long current = 2;
		
		for(int i = 3; i <= n; i++) {
			current = a + b;
			b = a;
			a = current;
		}
		return current;
	}
}