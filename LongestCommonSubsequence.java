import java.util.Scanner;
class LongestCommonSubsequence 
{ 
static int lcs( char[] X, char[] Y, int m, int n ) 
{ 
	if (m == 0 || n == 0) 
	return 0; 
	if (X[m-1] == Y[n-1]) 
	return 1 + lcs(X, Y, m-1, n-1); 
	else
	return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n)); 
} 
static int max(int a, int b) 
{ 
	return (a > b)? a : b; 
} 

public static void main(String[] args) 
{   Scanner sc=new Scanner(System.in);
	System.out.println("Enter Sequence 1");
	String s1 =sc.next(); 
	System.out.println("Enter Sequence 2");
	String s2 =sc.next(); 
    char[] x=s1.toCharArray(); 
	char[] y=s2.toCharArray(); 
	int m = x.length; 
	int n = y.length; 
    System.out.println("Length of LCS is::" + 
								lcs( x, y, m, n ) ); 
} 

} 
 
