
import java.util.*;
class TSP
{
    int n;
    private Stack<Integer> stack;
    public TSP()
    {
        stack = new Stack<Integer>();
    }
 
    public void tsp(int a[][])
    {
        n = a[1].length - 1;
        int[] vis = new int[n+ 1];
        vis[1] = 1;
        stack.push(1);
        int element, dst = 0, i;
        int min = Integer.MAX_VALUE;
        boolean minFlag = false;
        System.out.print(1 + "\t");
        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = 1;
            min = Integer.MAX_VALUE;
            while (i <= n)
            {
                if (a[element][i] > 1 && vis[i] == 0)
                {
                    if (min > a[element][i])
                    {
                        min = a[element][i];
                        dst = i;
                        minFlag = true;
                    }
                }
                i++;
            }
            if (minFlag)
            {
                vis[dst] = 1;
                stack.push(dst);
                System.out.print(dst + "\t");
                minFlag = false;
                continue;
            }
            stack.pop();
        }
    }
 
    public static void main(String arg[])
    {
             int nodes;
             System.out.println("Enter the number of nodes in the graph");
            Scanner sc= new Scanner(System.in);
            nodes = sc.nextInt();
            int a[][] = new int[nodes + 1][nodes + 1];
            System.out.println("Enter the adjacency matrix");
            for (int i = 1; i <= nodes; i++)
            {
                for (int j = 1; j <= nodes; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 1; i <= nodes; i++)
            {
                for (int j = 1; j <= nodes; j++)
                {
                    if (a[i][j] == 1&& a[j][i] == 0)
                    {
                        a[j][i] = 1;
                    }
                }
            }
            System.out.println("The cities are visited as: ");
            TSP t = new TSP();
            t.tsp(a);
        
        
    }
}