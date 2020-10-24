import java.util.Scanner;
class sum
{
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=read.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Result="+sum);
				
	}
}

