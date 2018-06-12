package jconsole;

public class DeadLock {

	static class SynAddRunnable implements Runnable{
		int a,b;
		
		public SynAddRunnable(int a,int b){
			this.a=a;
			this.b=b;
		}

		/**
		 * 产生死锁的原因是Integer.valueOf()方法基于减少对象创建次数
		 * 和节省内存的考虑，[-128,127]之间的数字会被缓存，当valueOf()
		 * 方法传入参数在这个范围之内，将直接返回缓存中的对象。
		 * 	 */
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Integer.valueOf(a)) {//--线程a可能等待线程b向缓存中存入1
				synchronized (Integer.valueOf(b)) {//--线程b可能等待线程a向缓存中存入2
					System.out.println(a+b);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			new Thread(new SynAddRunnable(1, 2)).start();
			new Thread(new SynAddRunnable(2, 1)).start();
		}
	}
}
