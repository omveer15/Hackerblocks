/******************************factorial of a number using recursion************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number ");
	    int n=sc.nextInt();
		System.out.println("Answer="+fact(n));
	}
	
	public static int fact(int n)
    {
        if(n==0)
            return 1;
            
        int fn=fact(n-1);
        return fn*n;
    }
}
