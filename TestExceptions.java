class TestExceptions {

    static void e() {
      // might cause any of the following unchecked exceptions to be thrown:
      // Ex1, Ex2, Ex3, Ex4
    }
    
    static void d() {
      try {
          e();
      } catch (Ex1 ex) {
          System.out.println("d caught Ex1");
      }
    }
    
    static void c() {
      try {
          d();
      } catch (Ex2 ex) {
          System.out.println("c caught Ex2");
          // now cause exception Ex1 to be thrown
      }
    }
    
    static void b() {
      try {
          c();
      } catch (Ex1 ex) {
          System.out.println("b caught Ex1");
      } catch (Ex3 ex) {
          System.out.println("b caught Ex3");
      }
    }
    
    static void a() {
      try {
          b();
      } catch (Ex1 ex) {
          System.out.println("a caught Ex1");
      } catch (Ex4 ex) {
          System.out.println("a caught Ex4");
          // now cause exception Ex1 to be thrown
      }
    }
    
    public static void main(String[] args) {
        a();
    }
}