package methodHandle;

import static java.lang.invoke.MethodHandles.lookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
/**
 * MethodHandle演示
 * @author 尹伟丞
 *
 */
public class MethodHandleTest {

	static class A{
		public void println(String s){
			System.out.println(s);
		}
	}
	
	private static MethodHandle getPrintlnMH(Object receiver) throws Throwable{
		//设置方法类型
		MethodType mt = MethodType.methodType(void.class, String.class);
		//查找符合给定的方法名称、方法类型，并且符合调用权限的方法句柄。
		//由于调用的方法为虚方法，所以第一个参数表示方法的接收者。
		return lookup().findVirtual(receiver.getClass(), "println", mt).bindTo(receiver);
	}
	public static void main(String[] args) throws Throwable {
		Object obj = System.currentTimeMillis()%2==0?System.out:new A();
		getPrintlnMH(obj).invokeExact("icyfenix");
	}
}
