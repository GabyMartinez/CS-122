import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers are you entering?");
		int n = scan.nextInt();
		
		int[] intList = new int[n];
		
		System.out.println("Please enter numbers: ");
		for (int i = 0; i < n; i++)
			intList[i] = scan.nextInt();
		
		System.out.println("Enter the number of values you wish returned");
		int input = scan.nextInt();
		
		Task2.minumums(intList,input);
		

	}
	public static void minumums(int[]list, int k){
		int [] mins = new int[list.length];
		
		int min, temp;
		for (int index = 0; index < list.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
				if (list[scan]<list[min])
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
			mins[index] = min;
		}
		
		for(int i=0; i<k; i++) {
			System.out.print(list[mins[i]] + ", ");
		}//needs some tweaking :|
	}
}
