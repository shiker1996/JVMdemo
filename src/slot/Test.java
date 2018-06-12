package slot;

public class Test {

	public static void main(String[] args) {
		/**
		 * 局部变量表Slot复用对垃圾收集的影响之一。
		 */
		/*
		 * byte[] placeholder = new byte[64*1024*1024]; System.gc();
		 */
		/**
		 * 局部变量表Slot复用对垃圾收集的影响之二。
		 */
		/*{
			byte[] placeholder = new byte[64 * 1024 * 1024];
		}
		System.gc();*/
		/**
		 * 局部变量表Slot复用对垃圾收集的影响之三。
		 */
		{
			byte[] placeholder = new byte[64 * 1024 * 1024];
			//placeholder = null;
		}
		int a = 0;
		System.gc();
	}
}
