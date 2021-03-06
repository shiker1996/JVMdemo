package visualVM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Btrace跟踪演示
 * 
 * @author 尹伟丞
 * 
 */
public class BTraceTest {
	
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws Exception {
		BTraceTest test = new BTraceTest();
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		for (int i = 0; i < 10; i++) {
			reader.readLine();
			int a = (int) Math.round(Math.random() * 1000);
			int b = (int) Math.round(Math.random() * 1000);
			System.out.println(test.add(a, b));
		}
	}
}
