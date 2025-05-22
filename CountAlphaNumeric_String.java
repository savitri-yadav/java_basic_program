package String_Array_Example;
import java.util.Arrays;

public class CountAlphaNumeric_String {
	public static void main(String[] args) {
		int count=0; int temp=0;
		String input="PR no 24";
		char[] array=input.toCharArray();
		System.out.println(Arrays.toString(array));
		for(int i=0;i<=array.length-1;i++)
		{
		if(Character.isAlphabetic(array[i])==true)
		{
			count++;
		}
		if(Character.isDigit(array[i])==true)
		{
			temp++;
		}

		}
		System.out.println("count of alpha:"+count);
		System.out.println("count of digit:"+temp);
	}

}
