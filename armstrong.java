import java.util.Scanner;
class armstrong
{
	public static void main(String[] args)
	{
		int res=0;
		int rem,n;
		int m;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		n=scan.nextInt();
		m=n;
		for(int i=0;i<3;i++)
		{
			rem=m%10;
			res=res+(rem*rem*rem);
			m=m/10;
		}
		if(res==n)
			System.out.println("Given no is armstrong ");
		else
			System.out.println("Given no is not armstrong ");
		
	}
}