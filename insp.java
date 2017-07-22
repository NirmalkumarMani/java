import java.io.*;
import java.util.*;
class insp
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values in the Array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();

           
        }
         System.out.println("after inserting:");
        for(int j=0;j<a.length;j++)
        {
            System.out.println(a[j]);

            
        }
    }
}