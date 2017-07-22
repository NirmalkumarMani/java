import java.io.*;
interface A
{
    int x=1000;
}
interface B extends A
{
    int y=100;
}
class Hellow implements A,B
{
    public static void main(String args[])
    {
       
       System.out.println(y); 
      System.out.println(A.x);
       System.out.println(B.x);
    }
}