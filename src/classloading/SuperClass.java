package classloading;
/**
 * 
 * @author 尹伟丞
 *
 */
public class SuperClass {
	static {
		System.out.println("SuperClass init!");
	}
	public static int value = 123;
}