package classloading;
/**
 *
 * @author 尹伟丞
 *
 */
public class NotInitialization {
   
	public static void main(String[] args) {
		/**
		 * 被动使用类字段演示之一：
         * 通过子类引用父类的静态字段，不会导致子类初始化
		 */
		System.out.println(SubClass.value);
		/**
		 * 被动使用类字段演示2：
		 * 通过数组定义引用类，不会触发此类的初始化
		 */
		SuperClass[] sca = new SuperClass[10];
		/**
		 * 被动使用类字段演示3：
		 * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义
		 * 常量的类中，因此不会触发定义类的常量的初始化。
		 */
		System.out.println(ConstClass.HELLOWORLD);
	}
}
