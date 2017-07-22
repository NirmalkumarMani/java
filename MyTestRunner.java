import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
java org.junit.runner.JUnitCore <test CalcTest>

public class MyTestRunner {
  public static void main(String[] args) {
    Result result = JUnitCore.runClasses(CalcTest.class);
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
  }
}