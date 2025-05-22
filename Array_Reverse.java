package String_Array_Example;

import java.util.Arrays;

public class Array_Reverse {
	public static void main(String[] args) {
		int array[]= {9,0,2,7,6,5};
		int reverse[]=new int[array.length];
		for(int i=array.length-1,j=0; i>=0 && j<=array.length-1; i--, j++) {
		
			reverse[j]=array[i];
		}
		System.out.println(Arrays.toString(reverse));
		
		System.out.println();
		
		//New Problem
		String name[]= new String[3];
		name[0]="Deb";
		name[1]="Bed";
		name[2]="Dib";
		for(int i=0; i<=2; i++)
		{
			System.out.println(name[i]);
			//System.out.println(name[1]);
		}
     System.out.println(Arrays.toString(name));
     //System.out.println(Arrays.sort(name));

	
		
	}
	}

