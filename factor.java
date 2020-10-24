import java.util.Scanner;
class factor
{
	public static void main(String[] args)
	{
		int i;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=read.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.println("factor"+i);
		}
	}
}
