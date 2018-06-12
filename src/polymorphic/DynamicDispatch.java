package polymorphic;
/**
 * 方法动态分派演示
 * @author 尹伟丞
 *
 */
public class DynamicDispatch {

	static abstract class Human{
		protected abstract void sayHello();
	}
	
	static class Man extends Human{

		@Override
		protected void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("man say hello");
		}
		
	}
	
	static class Woman extends Human{

		@Override
		protected void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("woman say hello");
		}
		
	}
	
	public static void main(String[] args) {
		Human man = new Man();
		Human woman = new Woman();
		man.sayHello();
		woman.sayHello();
		man = new Woman();
		man.sayHello();
	}
}