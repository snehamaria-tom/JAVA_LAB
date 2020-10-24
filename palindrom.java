import java.util.Scanner;
class palindrom
{
	public static void main(String[] args)
	{
		int n,res=0,rem,m,p;
		int c=0,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		m=n;
		p=n;
		while(m!=0)
		{
			m=m/10;
			c=c+1;
		}
		for(i=0;i<c;i++)
		{
			rem=p%10;
			res=res*10+rem;
			p=p/10;
		}
		if(res==n)
			System.out.println("Given no is palindrome");
		else
			System.out.println("Given no is not palindrome");
		
	}
}
