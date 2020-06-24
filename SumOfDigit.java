import java.util.*;
public class SumOfDigit
{
	public static void main(String[] args) {
	int n=1234;
	int sum=0;
	int rem;
		for(int i=0;i<4;i++)
		{
			
			 sum=sum+n%10;
			
			 n=n/10;
			
		}
		System.out.println(sum);
			}
	}		
	
