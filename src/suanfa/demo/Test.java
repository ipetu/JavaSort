package suanfa.demo;

public class Test {

	private static void originMethod(long n) {
		System.out.println("**原始循环算法");
		long startTime = System.currentTimeMillis();
		long sum = 0;
		for (long i = 0; i <= n; i++) {
			sum += i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("结果:" + sum);
		System.out.println("用时:" + (endTime - startTime));
	}

	private static void advanceMethon(long n) {
		System.out.println("**等差循环算法");
		long startTime = System.currentTimeMillis();
		long sum = 0;
		long a1 = 1;
		long an = n;
		sum = (a1 + an) * n / 2;
		long endTime = System.currentTimeMillis();
		System.out.println("结果:" + sum);
		System.out.println("用时:" + (endTime - startTime));
	}

	public static void main(String[] args) {
		originMethod(10000000);
		advanceMethon(1000000000);
	}

}
