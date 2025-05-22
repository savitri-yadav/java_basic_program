package String_Array_Example;
import java.util.Arrays;

public class Min_Max_ValueOfArray {
	public static void main(String[] args) {
		int a[]= {10,20,50,60,34,42,2};
		int min=a[0];
		int max=a[0];
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]<min) {
				min =a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Min Value of an Array--> "+min);
		System.out.println("Max Value of an Array--> "+max);

		
		//SECOND WAY TO FIND MIN AND MAX VALUE OF ARRAY
		
		int num[]= {200,40,50,16,100,8};
		Arrays.sort(num);
		System.out.println("Max Value: " +num[num.length-1]);
		System.out.println("Min Value Is--> " +num[0]);
	}
}
