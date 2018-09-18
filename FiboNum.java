import java.util.*;

class FiboNum{
	public static int fibo(int num){
	    if (num == 0)
    {
        return 0;
    }
    else if (num == 1)
    {
        return 1;
    }
    else
    {
        return(fibo(num - 1) + fibo(num - 2));
    }

}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the place of nth fibonacci no.");
	int n=sc.nextInt();
	int f=fibo(n);
	System.out.print("Nth fibonacci no."+f);
	}
}