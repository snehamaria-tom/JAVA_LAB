import java.util.Scanner;
class even{
	public static void main(String[] args)
	{
		int a;
		System.out.println("Enter the number to be checked");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("Given no is even");
		}
		else
			System.out.println("Given no is odd");
			
	}
	
}
