package outOfMemory;

public class JavaVMStackOOM {
	public void dontStop(){//本地方法栈溢出
		while(true){
		}
	}
	public void stackLeakByThread(){//虚拟机栈溢出
		while(true){
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					dontStop();
				}
			});
			thread.start();
		}
	}
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();
	}
}
