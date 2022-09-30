import java.util.Scanner;
class HarmonicNumber {
	static double nthHarmonic(int n) {

	    double sum=1;
		for(int i=2;i<=n;i++) {
			sum=(double)1/i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=sc.nextInt();
		System.out.println("sum of "+n+ "th value in the series is:" +nthHarmonic(n));
		
	}

}
