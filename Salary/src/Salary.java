import java.util.Scanner;

public class Salary 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		double basic = s.nextInt();
		String str = s.next();
		char ch = str.charAt(0);
		double hra = 0.2*basic;
		double da = 0.5*basic;
		double pf = 0.11*basic;
		double totalSalary;
		if(ch=='A') 
		{
			int allow=1700;
			totalSalary= (basic+hra+da+allow-pf);
			System.out.print(Math.round(totalSalary));
		}else if(ch=='B') 
		{
			int allow=1500;
			totalSalary= (basic+hra+da+allow-pf);
			System.out.print(Math.round(totalSalary));
		}else 
		{
			int allow=1300;
			totalSalary= (basic+hra+da+allow-pf);
			System.out.print(Math.round(totalSalary));
		}
				
	}

}
