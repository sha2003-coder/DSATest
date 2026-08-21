import java.util.Scanner;
public class Factorial
{
	public int  fact(int n)
	{
		 int result;

        if (n == 1 || n==0)
            return 1;
        result = fact(n - 1) * n;
        return result;  
		
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Factorial f1=new Factorial();
		System.out.println("enter only positive integer");
		int k=sc.nextInt();
		System.out.println("factorial of "+k+"! ="+f1.fact(k));
		//System.out.println(f1.fact(0));
		
	}
}