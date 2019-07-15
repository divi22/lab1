package lab1;

import java.util.Scanner;
public class NaturalNo {
	//calculate sum of integer divisible by 3 or 5
	public int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			NaturalNo nn=new NaturalNo();
			int n=0;
			System.out.println("Enter the value of n:");
			String str=sc.nextLine();
			try 
			{
				n=Integer.parseInt(str);
				if(n>0) {
					System.out.println("Sum of first"+n+"integer is"+nn.calculateSum(n));;
				}
				else {
					System.out.println("Enter positive integer");
				};
			}
			catch(NumberFormatException ex){
				System.out.println("Enter valid integer number");
				
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
				
			
		}
	}


	

