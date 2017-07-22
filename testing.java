import java.io.*;
import java.util.*;
class testing implements Cloneable
{

   // int id;
    void display()
    {
       
        System.out.println("result");


    }
    testing()
    {
     //   this.id=id;
        System.out.println("loading");

    }
public static void main(String args[]) throws IOException
	{
	testing s=new testing();
		s.display();
		try {
            Class cls = Class.forName("testing");
			testing s1 = (testing) cls.newInstance();
            s1.display();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
	
   try 		
   {

testing obj2 = (testing) s.clone();
 obj2.display();
   }
   catch(Exception s1)
   {
         System.out.println(s1);
   }	

//obj = (testing) new CreateObjectWithClassLoader().getClass().getClassLoader().loadClass("testing").newInstance();
//obj.display();
   }
}