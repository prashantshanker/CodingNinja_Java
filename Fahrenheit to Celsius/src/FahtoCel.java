import java.util.Scanner;

public class FahtoCel 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		while(S<=E) 
		{
			int C=(S-32)*5/9;
			System.out.print(S+"\t"+C+"\n");
			S=S+W;
		}
	}

}
