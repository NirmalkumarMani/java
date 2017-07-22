class Outer_Demo {
   int num;
   try {
       public void print() {
        System.out.println("This is an inner class");
       
    }
   } 
   catch (Exception e) 
   {
       System.out.println("hello");
   }
   
   ///public class Inner_Demo {

//}
 //  }
   
 
   //void display_Inner() {
       // System.out.println("This is an inner class1");
     // Inner_Demo inner = new Inner_Demo();
      //System.out.println("This is an inner class1");
      //inner.print();
     // System.out.println("This is an inner class1");
  //}
//}
   
//public class My_class {

   public static void main(String args[]) {
      
      Outer_Demo outer = new Outer_Demo();
      
      outer.print();
   
}}