package Practice_Questions;
import java.util.Scanner;

class Maths{
	void MAXValue(){
		Scanner scan = new Scanner(System.in);
		
		double[] num = new double[5];
		System.out.println("Enter 5 Numbers: ");
		for(int i=0; i<5; i++) {
			num[i] = scan.nextDouble();
		}
		
		double max = Double.MIN_VALUE;
		for(int i=0; i<5; i++) {
			if(max < num[i]) 
				max = num[i];
		}
		
		System.out.println("Maximum Number is "+ (double)max);
	}
}

public class Class_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths();
		m.MAXValue();
	}

}
