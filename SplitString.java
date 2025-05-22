package String_Array_Example;
import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
	      System.out.println("Please Enter a string");
        String s = s1.next();
        s1.close();
        String[] w = s.split(" ");    // Split by space

        for (String word : w) {
            System.out.println(word);
        }
    }
}
