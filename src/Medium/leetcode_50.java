package Medium;

public class leetcode_50 {
	
	public double fastpow(double x, long n) {
		if(n==0) return 1;
		if(n==1) return x;
		double half = fastpow(x, n/2);
		if(n%2==1) return x*half*half;
		else return half*half;
	}
	
	public double myPow(double x, int n) {
		long N = n;
		if(n<0) {
			x = 1.0/x;
			N = -N;
		}
		return fastpow(x, N);
    }
	
	public static void main(String[] args) {
		leetcode_50 l50 = new leetcode_50();
		System.out.println(l50.myPow(2.00000, -2));
		System.out.println(Math.pow(2.00000, -2147483648));
	}
}
