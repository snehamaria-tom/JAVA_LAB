import java.util.Scanner;
class factorial{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=read.nextInt();
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("factorial of given no="+f);
	}
}