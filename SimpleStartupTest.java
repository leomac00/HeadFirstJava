import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStartupTest {
  public static void main(String[] args) {
    // Instantiate SimpleStartup object
    SimpleStartup dot = new SimpleStartup();
    // Setup location
    int[] locations = { 2, 3, 4 };
    dot.setLocationCells(locations);
    // Test failing guess
    checkYourselfTest(dot, 1);
    // Test passing guess
    checkYourselfTest(dot, 2);

  }

  private static void checkYourselfTest(SimpleStartup SS, int guess) {
    List<Integer> locations = Arrays.stream(SS.getLocationCells()).boxed().collect(Collectors.toList());
    String testType = locations.contains(guess) ? "Success" : "Fail";
    String result = SS.checkYourself(guess);
    String testResult = "Failed";
    if ((testType.equals("Success") && result == GuessResult.HIT.getText())
        || (testType.equals("Fail") && result == GuessResult.MISS.getText())) {
      testResult = "Passed";
    }
    System.out.println(testType + " test type result: " + testResult);
  }
}
