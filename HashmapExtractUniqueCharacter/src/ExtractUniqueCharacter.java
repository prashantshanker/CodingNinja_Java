import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueCharacter {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String uniChars = uniqueChar(s.next());
		System.out.println(uniChars);
	}
	public static String uniqueChar(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String s1 = "";
		for(int i=0;i<str.length();i++) 
		{
			if(map.containsKey(str.charAt(i))) 
			{
				continue;
			}else 
			{
				map.put(str.charAt(i), 1);
				s1+=str.charAt(i);
			}
		}
		return s1;
	}
}
