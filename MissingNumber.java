import java.util.*;
import java.util.Scanner;

class MissingNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int v=x[0]-0;
        for(int i=0;i<n;i++)
        {
            if(v<(x[i]-i))
            {
                while((x[i]-i)!=v)
                {
                    System.out.print((v+i)+" ");
                    v++;
                } 
            }           
        }   
        
    }
}