import java.util.Scanner;

class PrimeFactors {
	 static int isprime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return 0;
		}
		return 1;
	}
	 static void primeFactors(int n) {
		 for(int i=2;i<=n;i++) {
			 if(isprime(i)==1) {
				 while(n%i==0) {
					 System.out.print(" "+i);
					 n/=i;
				 }
			 }
		 }
	 }
	

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		primeFactors(n);

	}

}
