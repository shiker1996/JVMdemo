package outOfMemory;

import java.util.ArrayList;
import java.util.List;

public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//避免fullGC回收常量池
		int i = 0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}
}
