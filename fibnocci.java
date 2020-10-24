import java.util.Scanner;
class fib{
	public static void main(String[] args)
	{
		int a=0,b=1;
		int c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=scan.nextInt(); 
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
	}
}
