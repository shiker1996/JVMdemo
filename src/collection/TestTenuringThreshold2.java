package collection;

public class TestTenuringThreshold2 {
	private static final int _1MB = 1024*1024;
	public static void testTenuringThreshold2(){
		byte[] allocaition1,allocaition2,allocaition3,allocaition4;
		allocaition1 = new byte[_1MB/4];
		allocaition2 = new byte[_1MB/4];
		allocaition3 = new byte[4*_1MB];
		allocaition4 = new byte[4*_1MB];
		allocaition4 = null;
		allocaition4 = new byte[4*_1MB];
	}
	public static void main(String[] args) {
		testTenuringThreshold2();
	}
}
