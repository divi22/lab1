package lab1;
import java.util.Scanner;

public class IncreasingNumber {
	public boolean checkNumber(String n) {
		for(int i=0;i<n.length()-1;i++);
		{
			int i=0;
			if(n.charAt(i)>n.charAt(i+1))
			{
				return false;
			}
			}
		return true;
}
	public static void main(String[] args) {
	try {
			Scanner sc=new Scanner(System.in);
			IncreasingNumber in=new IncreasingNumber();
			System.out.println("Enter number");
			int num;
			String str=sc.next();
			try {
				num=Integer.parseInt(str);
				if(str.length()<2)
					{
					System.out.println("Enter 1 more digit");
					}
				else {
					if(in.checkNumber(str))
					{
						System.out.println("Number is in increasing order");
					}
					else {
						System.out.println("Number is not in increasing order");
					}
				}
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
			
			

