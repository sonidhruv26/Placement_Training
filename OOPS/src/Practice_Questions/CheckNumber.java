package Practice_Questions;
import java.util.Scanner;

class Check{
	public void PosNeg(int n) {
		if(n>=0) {
			System.out.println("Check is Positive");
		}
		else {
			System.out.println("Check is Negative");
		}
	}
	
	public void EvenOdd(int n) {
		if(n%2==0) {
			System.out.println("Check is Even");
		}
		else {
			System.out.println("Check is Odd");
		}
	}
	
	public void checkPrime(int n) {
		if(n>1) {
			boolean ans = true;
			for(int i=2; i<Math.sqrt(n); i++) {
				if(n%i==0) {
					ans = false;
				}
			}
			System.out.println("Prime: " + ans);
		}
	}
	
	public void printPrime(int n) {
		if(n>0) {
			for(int i=2; i<=n; i++) {
				boolean ans = true;
				for(int j=2; j<=Math.sqrt(i); j++) {
					if(i%j == 0) {
						ans = false;
					}
				}
				if(ans == true)
					System.out.print(i+" ");
			}
		}
	}
	
	public void checkPalindromeInt(int n) {
		if(n>0) {
			
		}
	}
}

public class CheckNumber{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Check: ");
		int n = scan.nextInt();
		
		Check num = new Check();
		num.EvenOdd(n);
		num.PosNeg(n);
		num.checkPrime(n);
		num.printPrime(n);
	}
}
