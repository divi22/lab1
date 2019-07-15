package lab1;
import java.util.Scanner;

public class Difference {
	//method to find difference
	public int calculateDifference(int n) {
		double sumOfSquare=0;
		double diff=0;
		int squareOfSum=0;
		for(int i=0;i<=n;i++) {
			//sum of square of number
			sumOfSquare=sumOfSquare+Math.pow(i, 2);
			squareOfSum=squareOfSum+i;
		}
		//square of sum of natural number
		squareOfSum=squareOfSum*squareOfSum;
		//difference between sum of square and square of natural number
		diff=sumOfSquare-squareOfSum;
		return  (int) -diff;
		}

	public static void main(String[] args) {
		try {
		int no;
		Difference c=new Difference();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		no=sc.nextInt();
		System.out.println("Difference between sum of square and squares of number" +no+ "is" +c.calculateDifference(no));
		}
		//invalid input
		catch(Exception e) {
			System.out.println("Enter integer only");
		}
		}
}
