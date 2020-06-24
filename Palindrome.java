import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
		String d;
		Scanner sc=new Scanner(System.in);
		d=sc.nextLine();
		StringBuffer sg=new StringBuffer(d);
	System.out.println(sg.reverse());
	if(d.equals(sg))
	{
		System.out.println("palindrome");
	}
	else
		System.out.println("not palindrome");
			}
	}		
	
