class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[]a={1,2,3};	
		int[]b={4,5,6};
		int[][]c= new int[2][3];
		c[0] = a;
		c[1]=b;
		//or int[][]c = {a,b};
	    
	    for(int i=0;i<a.length;i++){
		if (i==(a.length-1))
		System.out.print(a[i]);
		else
		System.out.print(a[i] + ", ");
		}
		
		System.out.println();

		

		for(int[] i: switchArray(c)){
		      for(int n:i)
		        System.out.println(n);
		}
		
		System.out.println();
		
		printArray(a);
    	
	}
	
	public static int[][] switchArray(int[][]array){
		//switches the first two rows of a 2d array
		int[]temp;
		temp = array[0];
		array[0]=array[1];
		array[1]=temp;
		return array;
	}
	
	public static void printArray(int[]array){
		for(int i: array){
			System.out.println(i);
		}
	}
}