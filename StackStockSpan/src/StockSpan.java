import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		int output[] = stockSpan(input);
		for(int i = 0; i < size; i++) {
			System.out.print(output[i] + " ");
		}
	}
	public static int[] stockSpan(int[] price) 
	{
//		int temp[]=new int[price.length];
//		temp[0]=1;
//		for(int i=1;i<price.length;i++) 
//		{
//			int count=1;
//			for(int j=i;j>0;j--) 
//			{
//				if(price[i]>price[j-1]) 
//				{
//					count++;
//				}else 
//				{
//					break;
//				}
//			}
//			temp[i]=count;
//		}
//		return temp;
		int length=price.length;
        int[] S = new int[price.length];
        Stack<Integer> myStack = new Stack<>();
        int h = 0;
        for(int i = 0; i<length;i++){
            h = 0;
            while(!myStack.isEmpty()){
                if(price[i]> price[myStack.peek()]){
                    myStack.pop();
                } else {
                    break;
                }
            }
            h = myStack.isEmpty() ? -1 : myStack.peek();
            S[i] = i-h;
            myStack.push(i);
        }
        return S;	
	}
}
