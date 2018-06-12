package classloading;

/**
 * 字段解析
 * @author 尹伟丞
 *
 */
public class DeadLoopClass {
	static class DeadLoop {
		static {
			if (true) {//如果没有if语句编译器会报Initializer does not complete normally
				System.out.println(Thread.currentThread()
						+ "init DeadLoopClass");
				 while(true){
				
				 }
			}
		}
	}

	public static void main(String[] args) {
		Runnable script = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread() + "start");
				DeadLoop dlc = new DeadLoop();
				System.out.println(Thread.currentThread() + " run over");
			}
		};

		Thread thread1 = new Thread(script);
		Thread thread2 = new Thread(script);
		thread1.start();
		thread2.start();
	}
}
