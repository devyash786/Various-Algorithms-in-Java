import java.util.*; 
class GFG 
{ 

static void sortUsingHash(int a[], int n) 
{ 

	int max = Arrays.stream(a).max().getAsInt(); 
    int hash[] = new int[max + 1]; 
    for (int i = 0; i < n; i++) 
		hash[a[i]] += 1; 
    for (int i = 0; i <= max; i++) 
	{ 

		if (hash[i] != 0) 
		{ 

			
			for (int j = 0; j < hash[i]; j++) 
			{ 
				System.out.print(i+" "); 
			} 
		} 
	} 
} 


public static void main(String[] args) 
{   Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	 a[i] =sc.nextInt() ; 
 

	sortUsingHash(a, n); 
} 
} 

