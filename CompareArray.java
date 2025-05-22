package String_Array_Example;

import java.util.Arrays;

public class CompareArray {
public static void main(String[] args) {
	int arr1[]= {10,20,30,35};
	int arr2[]= {10,20,30,35};
	if(Arrays.equals(arr1, arr2)) {
		System.out.println("Both arrays are equals");
	}else {
		System.out.println("not equal");
	}
	
	String name[]= {"Ram", "Shyam", "radha"};
	String name1[]= {"Aru", "Adhya", "Kashvi"};
	boolean answer=Arrays.equals(name, name1);
	if(answer==true) {
		System.out.println("Both are equal");
	}else {
		System.out.println("not equal");
	}
}
}
