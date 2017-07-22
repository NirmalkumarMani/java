class in {
    public void call() {
        System.out.println("A.call");
    }
}

class B extends in {
    public void call() {
        System.out.println("B.call");
    }
}

public class Program {
    public static void main(String[] args) {

        
        in a = new in();
        
        a.call();
    }
}