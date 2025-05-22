package String_Array_Example;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter value for both the strings");
		String s1=s.next();
		String s2=s.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b=Arrays.equals(c1, c2);
		if(b==true) {
			System.out.println("They are Anagram");
		}
		else {
			System.out.println("They are not Anagram");
		}
		s.close();
	}

}
