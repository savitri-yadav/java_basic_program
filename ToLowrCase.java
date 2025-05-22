package String_Array_Example;
import java.util.Scanner;

public class ToLowrCase {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Original uppercase String: " + inputString);
        System.out.println("Converted lowercase String: " + lowercaseString);
    }
}
