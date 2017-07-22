import java.io.*;
import java.util.*;
class venkat
{
    int a;
    String b;

   venkat(int x,String y)
   {
//a=x;
//b=y;
System.out.println(x +""+ y);
   }
   
    static venkat ji()
    {
        int x=10;
    String y="vijay";
        return new venkat(x,y);

    }

public static void main(String args[]){
    ji();
}
}