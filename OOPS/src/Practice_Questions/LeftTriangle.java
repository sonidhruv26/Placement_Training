package Practice_Questions;
import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int n = scan.nextInt();

		for(int i=1; i<=n; i++) {
			for(int k=1; k<=2*(n-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
