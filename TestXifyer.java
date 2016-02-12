import static org.junit.Assert.*;
import org.junit.Test;

public class TestXifyer {
	@Test
	public void testXify() {
		Xifyer x = new Xifyer();
		int[] a = new int[]{1,2,3};
		int[] result = new int[]{1,2,2,3,3,3};
		a = x.xify(a);
		for(int i = 0; i < a.length; i++){
			//System.out.println(result[i] + "   " + a[i]);
			assertEquals(result[i], a[i]);
		}
	}
	public static void main(String[] args) {
		jh61b.junit.TestRunner.runTests("all", TestXifyer.class);
	}
}