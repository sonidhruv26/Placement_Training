package Practice_Questions;
import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = scan.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}

}
