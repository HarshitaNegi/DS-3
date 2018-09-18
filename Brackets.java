import java.util.*;

public class Brackets
{
	private static Scanner sc = new Scanner(System.in);
	private static String open = "({[<";
	private static String close = ")}]>";
	
	public static boolean check(String str , int start, int end)
	{
		
		if (start > end) 
			return true;
		if (end == 1 || close.contains(Character.toString(str.charAt(0)))) 
			return false;
		String brac = Character.toString(str.charAt(start)); 
		
		if (open.contains(brac)) 
		{  
			int check = open.indexOf(brac); 
			String brac_close = Character.toString(close.charAt(check)); 
			if (!str.contains(brac_close)) 
				return false;
		}
		
		if (close.contains(brac)) {
			int t = start-1;
			int check = close.indexOf(brac);
			String brac_str = Character.toString(str.charAt(t));
			String brac_open = Character.toString(open.charAt(check));
			
			while (!open.contains(brac_str)) 
			{ 
				t--;
				brac_str = Character.toString(str.charAt(t));
			}
			
			if (!brac_str.equals(brac_open)) 
				return false;
			else
				return true;
		} 
		
		return check(str,++start,end);
	}
	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("If string is balanced : " + check(s,0,s.length()));
	}
	
}