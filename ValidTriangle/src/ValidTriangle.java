import java.util.Scanner;
public class ValidTriangle 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int Side1=s.nextInt();
		int Side2=s.nextInt();
		int Side3=s.nextInt();
		if((Side1+Side2)>Side3 && (Side1+Side3)>Side2 && (Side3+Side2)>Side1) 
		{
			System.out.println("Vaild Trinagle");
			triangletype(Side1, Side2, Side3);
		}else 
		{
			System.out.println("Not A Triangle");
		}
		
	}
  static void triangletype(int Side1, int Side2, int Side3) 
  {
	 if(Side1==Side2 && Side2==Side3) 
	 {
		 System.out.println("Equilateral");
	 }else if(Side1==Side2 || Side2==Side3 || Side1==Side3) 
	 {
		 System.out.println("Isoscelus");
	 } else 
	 {
		 System.out.println("Other Triangle");
	 }
  }
}
