package String_Array_Example;

public class ArrayNoToBeCheckedAtIndex {
	public static void main(String[] args) {
		/*int[] numbers = {1, 5, 8, 12, 15};
        int numToCheck = 8;
        boolean found = false;
        for (int number : numbers) {
            if (number == numToCheck) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(numToCheck + " is present in the array.");
        } else {
            System.out.println(numToCheck + " is not present in the array.");
        }
		*/
		int no[]=new int[5];
		no[0]=10;
		no[1]=20;
		no[2]=30;
		no[3]=15;
		no[4]=18;
		int notocheck=20;
		boolean found = false;
		for(int i=0;i<=no.length-1; i++) {
			//System.out.println("Array listing --> "+no[i]);
			if(notocheck==no[i]) {
				//System.out.println("True");
				System.out.println(+no[i]+"  is present at index--> "+i);
				found=true;
				break;
			}if(no.length==i+1) {
				System.out.println("Sorry We are not able to find");
			}
		}
		
		 /*int no[] = new int[5];
	        no[0] = 10;
	        no[1] = 20;
	        no[2] = 30;
	        no[3] = 15;
	        no[4] = 18;
	        int notocheck = 20;
	        boolean found = false;
	        for (int i = 0; i < no.length; i++) {
	            System.out.println("Checking number: " + no[i]);
	            if (notocheck == no[i]) {
	                System.out.println("True: Number is present at index " + i);
	                found = true;
	                break; // stop loop once found
	            }
	        }
	        if (!found) {
	            System.out.println("Sorry, we are not able to find the number.");
	        }*/
		
	}

}
