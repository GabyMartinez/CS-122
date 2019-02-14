//this really didn't work out. I've been at this for a while and can't get it to work. 
import java.util.Scanner;
public class Task1 {
	public static void main(String[]arg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers total in list? (one more than entered values)\n"
				+ "enter 0 for missing value");
		int n = scan.nextInt();
		
		int[] intList = new int[n];
		
		System.out.println("Please enter numbers: ");
		for (int i = 0; i < n; i++)
			intList[i] = scan.nextInt();
		Task1.selectionSort(intList, n);
		
		System.out.println ("\nYour numbers in sorted order...");
		for (int i = 0; i < n; i++)
			System.out.print(intList[i] + " ");
		System.out.println(Task1.missingValue(intList, n));
	}
	
	//takes in an int[] of size n
	//Find the number that is missing in the range
	private static void selectionSort (int[] list, int n) {
		int min;
		int temp;
		for (int index = 0; index < list.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
				if (list[scan] < list[min])
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}	
	/*	for(int a : list) {
			System.out.print(a);
		}
		
	//	for each, compare min++	to the next number in sequence
	/*	
		 boolean isMissing = true;
		 int index = 1, missing = 1;
		 int min2 = list[0] + 1;
		 while(isMissing && index<list.length)
		 {
		  	if (min2 != list[index]) {
		  		min2 = missing;
		 		isMissing = false;	
		  	}
		 	else { 
		 		min2++;
		 		index++;
		 	}
		 }
	  
	/*/ 
	public static int missingValue(int[] list, int n) {
		selectionSort(list, n);
		for(int i = 1; i>list.length; i++){
			int compare = list[1] + 1; 
			for (int scan = i+1; scan < list.length; scan++) {
		  		if(compare == list[i])
		  			compare = compare + 1;
		  		else
		  			list[0] = compare;
			}
	  	}		
	//*/		
	//	System.out.println(list[0]);
		return list[0];
	}
}
