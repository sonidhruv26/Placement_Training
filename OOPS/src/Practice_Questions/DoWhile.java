package Practice_Questions;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter number: ");
		int n;
		do{
			n = scan.nextInt();
			if(n<0)
				continue;
			sum += n;
		}while(n>0);
		System.out.println("Sum: "+sum);
	}
}
