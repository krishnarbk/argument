import java.util.Scanner;
public class Case
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char input=0;
String in=Character.toString(input);
in=sc.nextLine();
if(in.charAt(0)<65 && in.charAt(0)>90)
	System.out.println(in.toUpperCase());
else 
System.out.println(in.toLowerCase());
}
}