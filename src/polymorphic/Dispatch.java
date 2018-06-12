package polymorphic;

public class Dispatch {

	static class QQ{}
	
	static class _360{}
	
	public static class Father{
		public void hardChoice(QQ arg){
			System.out.println("father choose qq");
		}
		
		public void hardChoice(_360 arg){
			System.out.println("father choose 360");
		}
	}
	
	public static class Son extends Father{
		public void hardChoice(QQ arg){
			System.out.println("son choose qq");
		}
		
		public void hardChoice(_360 arg){
			System.out.println("son choose 360");
		}
	}
	
	public static void main(String[] args) {
		Father father = new Father();
		Father son = new Son();
		//编译阶段编译器的选择过程，也就是静态分派的过程。
		//选择目标方法的依据有两点：一是静态类型；二是方法参数
		father.hardChoice(new _360());
		son.hardChoice(new QQ());
		/**
		 * 运行阶段的编译结果，动态分派的过程取决于接受者的实际类型
		 */
	}
}
