import java.util.Scanner;

public class IFELSE 
{
 public static void main(String[] args) 
 {
	 Scanner s = new Scanner(System.in);
	 int a = s.nextInt();
	 int b = s.nextInt();
	 if(a>b) 
	 {
		 System.out.println(a);
	 }else 
	 {
		 System.out.println(b);
	 }
	 if(a%2==0) 
	 {
		 System.out.println("a is even ");
	 }else 
	 {
		 System.out.println("a is odd");
	 }
 }
}
