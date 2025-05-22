package String_Array_Example;

public class Array_sum_average {
	public static void main(String[] args) {
		int n[]= {5,10,15,20,25};
		int sum=0;
		double avg=0;
		for(int i=0; i<=n.length-1; i++) {
			sum=sum+n[i];
		}
		System.out.println("Sum of an array --> "+sum);
		avg=sum/n.length;
		System.out.println("Avg of an Array -- > "+avg);
	}
}
