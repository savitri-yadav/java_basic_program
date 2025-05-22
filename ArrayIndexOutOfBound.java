package String_Array_Example;

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		try
		{
			int c[]= {1,2,3,4};
			System.out.println("Array are "+c[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of bond ");
			
		}
	}

}
