public class AbstractDemo {

   public static void main(String [] args) {
      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
      Employee11 e = new Employee11("Gopi", "coimbatore ,ee", 43);
      System.out.println("\n Call mailCheck using Employee reference--");
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}