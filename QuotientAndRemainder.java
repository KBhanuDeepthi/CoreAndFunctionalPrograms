import java.util.Scanner;
class QuotientAndRemainder {

	public static void main(String[] args) {
		System.out.println("Enter the value ofnum1 and num2 :");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int Quotient=0,remainder=0;
		 Quotient=num1/num2;
		 remainder=num1%num2;
		 System.out.println("Quotient :"+Quotient);
		 System.out.println("remainder :"+remainder);

	}

}
