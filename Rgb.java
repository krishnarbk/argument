import java.util.Scanner;
public class Rgb
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char input=0;
String in=Character.toString(input);
in=sc.nextLine().toUpperCase();
switch(in) {
case "R":System.out.println("Red");
break;
case "B":System.out.println("Blue");
break;
case "Y":System.out.println("Yellow");
break;
case "o":System.out.println("orange");
break;
default :
	System.out.println("invalid");


}

}
}