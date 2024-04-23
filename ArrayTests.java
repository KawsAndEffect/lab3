import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {24, 3, 7, 8};
    assertArrayEquals(new int[]{8, 7, 3, 24}, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {0, 2, 4, 6, 8, 10};
    assertArrayEquals(new int[]{10, 8, 6, 4, 2, 0}, ArrayExamples.reverseInPlace(input1));
	}
}
