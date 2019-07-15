package lab1;
import java.util.Scanner;

public class PowerOf {
	//method to check number
	public boolean checkNumber(int n) {
		int i=0;
		double res=0;
		while(n>res){
			res=Math.pow(2, i);
			i++;
		}
		if(n==res) {
			return true;
			}
		else {
			return false;
		}
		}
	public static void main(String[] args) {
		try {
			PowerOf po=new PowerOf();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
			String str=sc.next();
			try {
				int num=Integer.parseInt(str);
				if(po.checkNumber(num))
				{
					System.out.println(num+"is a power of 2");
				}
				else {
					System.out.println(num+"is not a power of 2");
				}
			}
			catch(NumberFormatException ex) {
				System.out.println("Enter a valid number");
				}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
		
	


