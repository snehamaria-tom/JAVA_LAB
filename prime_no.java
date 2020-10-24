import java.util.Scanner;
class prime{
	public static void main(String[] args)
	{
		int flag=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n=scan.nextInt();
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Given no is prime");
			
		}
		else
			System.out.println("Given no is non prime");
		
	}
}
