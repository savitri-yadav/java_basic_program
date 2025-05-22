package String_Array_Example;
import java.util.Scanner;
public class String_Basics {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please Enter value for both strings");
		String str=s1.next();
		String str1=s1.next();
		System.out.println("after Char at index the string O/P -- > " + str.charAt(3));
		System.out.println("after Comparing the string O/P -- > " + str.compareTo(str1));
		System.out.println("after Concatnation the string O/P -- > " + str.concat(str1));
		System.out.println("after IgnoreCase the string O/P -- > " + str.compareToIgnoreCase(str1));

		String out="";
		//Length of the string
		int n=str.length();
		System.out.println(n);
		for(int i=n-1; i>=0; i--) {
			char c=str.charAt(i);
			out= out+c;
		}
		System.out.println(str);
		System.out.println(out);
		//Compare 2 strings
		if(str.equals(out)) {
			System.out.println("they are palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		s1.close();
		
	}

}
