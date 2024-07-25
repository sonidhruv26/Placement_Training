package Practice_Questions;
import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a<b && a<c) {
			if(b<c) {
				System.out.print(c+" ");
				System.out.print(b+" ");
				System.out.print(a+" ");
			}
			else {
				System.out.print(b+" ");
				System.out.print(c+" ");
				System.out.print(a+" ");
			}
		}
		else if(b<a && b<c) {
			if(a<c) {
				System.out.print(c+" ");
				System.out.print(a+" ");
				System.out.print(b+" ");
			}
			else {
				System.out.print(a+" ");
				System.out.print(c+" ");
				System.out.print(b+" ");
			}
		}
		else {
			if(a<b) {
				System.out.print(b+" ");
				System.out.print(a+" ");
				System.out.print(c+" ");
			}
			else {
				System.out.print(a+" ");
				System.out.print(b+" ");
				System.out.print(c+" ");
			}
		}
	}

}
