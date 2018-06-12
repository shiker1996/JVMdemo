package slot;
/**
 * 方法静态解析演示
 * @author 尹伟丞
 *
 */
public class StaticResolution {

	public static void  sayHello() {

		System.out.println("hello world");
	}
	
	public static void main(String[] args) {
		StaticResolution.sayHello();
	}
}
