import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  Sum testSumClass = new Sum();

  @Test
  public void testSumMethod1() throws Exception {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    assertEquals(6, testSumClass.sumMethod(numbers));
  }

  @Test
  public void testSumMethod2() throws Exception {

    ArrayList<Integer> numbers = null;
    assertEquals(0,  testSumClass.sumMethod(numbers));
  }
}