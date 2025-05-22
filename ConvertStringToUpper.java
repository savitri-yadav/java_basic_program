package String_Array_Example;
import java.util.Scanner;

public class ConvertStringToUpper {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);
        scanner.close();
    }
}
