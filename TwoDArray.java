import java.util.Scanner;
class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Enter the value i " +i+ "And Value of j" +j);
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Array elements are:");
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(" " +arr[i][j]);
				
			}
			System.out.println();
		}
		
	}

}



