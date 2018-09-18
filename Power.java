import java.util.Scanner;
class Power
{
	public static int cal(int a,int b)
	{
		if(b==0)
		{
			return 1;
		}
		else
		{
			int result=a*cal(a,b-1);
			return result;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int x=sc.nextInt();
		System.out.println("enter the power:");
		int y=sc.nextInt();
		int c=cal(x,y);
		System.out.println(c);
	}
}