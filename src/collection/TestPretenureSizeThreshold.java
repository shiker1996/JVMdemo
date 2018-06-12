package collection;

public class TestPretenureSizeThreshold {
	private static final int _1MB = 1024*1024;
	public static void testPretenureSizeThreshold(){
		byte[] allociation;
		allociation = new byte[4*_1MB];
	}
	public static void main(String[] args) {
		testPretenureSizeThreshold();
	}
}
