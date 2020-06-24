import java.util.Scanner;
public class Prime
{
	public static void main(String[] args) {
	boolean flag=true;
	int n=5;
		for(int j=2;j<n;j++)
		{
			if(n%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			
			System.out.println("prime");
		else
			System.out.println("no p");
	}
	}		
	