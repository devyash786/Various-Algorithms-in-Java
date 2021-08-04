import java.util.*; 
class RandomizedQuickSort 
{   
	static int n=10;
    static void inputElements()
	{  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter number of elements");
	   n=sc.nextInt();
	}
	static int arr[]=new int[n];
	static void inputArray()
	 { Scanner sc=new Scanner(System.in);
	    System.out.println("Enter  elements");
		for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
	   
	 }
	
	void random(int lower,int upper) 
	{ 
	    Random rand= new Random(); 
		int pivot = rand.nextInt(upper-lower) + lower; 
		int temp1=arr[pivot]; 
		arr[pivot]=arr[upper]; 
		arr[upper]=temp1; 
	} 
	int partition(int arr[], int lower, int upper) 
	{ 
		int pivot = arr[upper]; 
	    int i = (lower-1); 
		for (int j = lower; j < upper; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 
                int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		
		int temp = arr[i+1]; 
		arr[i+1] = arr[upper]; 
		arr[upper] = temp; 

		return i+1; 
	} 
   void sort(int arr[], int lower, int upper) 
	{ 
		if (lower < upper) 
		{ 
			
			int pi = partition(arr, lower, upper); 

			
			sort(arr, lower, pi-1); 
			sort(arr, pi+1, upper); 
		} 
	} 
   static void printArray(int arr[]) 
	{ 
		 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{   inputElements();
		inputArray();
		RandomizedQuickSort ob = new RandomizedQuickSort(); 
		ob.sort(arr, 0, n-1); 
		System.out.println("Sorted array is:"); 
		printArray(arr); 
	} 
} 
 