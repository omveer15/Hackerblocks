/******************************prints no to 1  using recursion************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{   
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number ");
	    int n=sc.nextInt();
		series(n);
	}
	
	public static void series(int n)
    {
        if(n==0)
            return;
            
        System.out.println(n);
        series(n-1);
    }
}
