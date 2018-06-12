package collection;

public class TestTenuringThreshold {
	private static final int _1MB = 1024*1024;
	public static void testTenuringThreshold(){
		byte[] allocaition1,allocaition2,allocaition3;
		allocaition1 = new byte[_1MB/4];
		allocaition2 = new byte[4*_1MB];
		allocaition3 = new byte[4*_1MB];
		allocaition3 = null;
		allocaition3 = new byte[4*_1MB];
	}
	public static void main(String[] args) {
		testTenuringThreshold();
	}
}
