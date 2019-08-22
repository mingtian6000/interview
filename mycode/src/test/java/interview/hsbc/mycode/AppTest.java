package interview.hsbc.mycode;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		App app = new App();
		ArrayList<String> result = app.letterCombinations("34");
//		for (String i : result) {
//			System.out.print(i + " ");
//		}
		String[] result_real = result.toArray(new String[result.size()]);
		String[] result_expect = new String[] { "dg", "dh", "di", "eg", "eh", "ei", "fg", "fh", "fi" };
		assertEquals(true, Arrays.equals(result_real, result_expect));

	}

	public void testApp1() {
		App app = new App();
		ArrayList<String> result = app.letterCombinations("032");
		String[] result_real = result.toArray(new String[result.size()]);
		String[] result_expect = new String[] { "da", "db", "dc", "ea", "eb", "ec", "fa", "fb", "fc" };
		assertEquals(true, Arrays.equals(result_real, result_expect));
	}

	public void testApp2() {
		App app = new App();
		ArrayList<String> result = app.letterCombinations("9");
		String[] result_real = result.toArray(new String[result.size()]);
		String[] result_expect = new String[] { "w", "x", "y", "z" };
		assertEquals(true, Arrays.equals(result_real, result_expect));
	}

	public void testApp3() {
		App app = new App();
		ArrayList<String> result = app.letterCombinations("01");
		String[] result_real = result.toArray(new String[result.size()]);
		String[] result_expect = new String[] { "" };
		assertEquals(true, Arrays.equals(result_real, result_expect));
	}

	public void testApp4() {
		App app = new App();
		ArrayList<String> result = app.letterCombinations("99");
		String[] result_real = result.toArray(new String[result.size()]);
		String[] result_expect = new String[] { "ww", "wx", "wy", "wz", "xw", "xx", "xy", "xz", "yw", "yx", "yy", "yz", "zw", "zx", "zy", "zz"};
		assertEquals(true, Arrays.equals(result_real, result_expect));
	}
	
//	public void testApp5() {
//		App app = new App();
//		ArrayList<String> result = app.letterCombinations("23458");
//		String[] result_real = result.toArray(new String[result.size()]);
//		String[] result_expect = new String[] { "ww", "wx", "wy", "wz", "xw", "xx", "xy", "xz", "yw", "yx", "yy", "yz", "zw", "zx", "zy", "zz"};
//		assertEquals(true, Arrays.equals(result_real, result_expect));
//	}
}
