import java.util.Scanner;
public class LastDigit
{
	public boolean lastDigit(int a, int b) {
		   int digit1=a%10;
		        int digit2=b%10;
		       if (digit1==digit2)
		           return true;
		        else return false;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

}
}