class MammalInt{
}
public class Animal implements MammalInt {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      Animal m = new Animal();
      m.eat();
      m.travel();
   }
} 
