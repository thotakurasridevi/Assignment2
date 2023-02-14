import java.io.*;   
import java.util.*; 
import java.util.Scanner;  
class UniqueNumber 
{
    public static void unique(int x[], int n)
	{
        for (int i = 0; i < n; i++)
		{
            int j;
            for (j = 0; j < i; j++)
            {
                if(x[i] == x[j])
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.print( x[j] + " ");
                
            }
        }
    }              
    
	public static void main (String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }		
		unique(x, n);

	}
}