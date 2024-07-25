package Practice_Questions;
import java.util.Scanner;

public class Palindrome {

	public static int count(int n){
		if(n>=0) {
			int count = 0;
			while(n>0) {
				count++;
				n /= 10;
			}
			return count;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		int digit = count(n);
		int temp = n;
		int rem = n;
		int ans = 0;
		while(temp>0) {
			ans += (temp%10 * Math.pow(10,digit-1));
			digit--;
			temp /= 10;
		}
		if(ans == n) {
			System.out.println("Number is Palindrome");
		}
		else
			System.out.println("Number is not Palindrome");
	}

}
