package genericTypes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author 尹伟丞 泛型擦除，通过jd-gui反编译可查看
 */
public class Demo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("hello", "你好");
		map.put("how are you", "吃了没？");
		System.out.println(map.get("hello"));
		System.out.println(map.get("how are you"));

		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		System.out.println(sum);
		
		if(true){
			System.out.println("block1");
		}else{
			System.out.println("block2");
		}
		/**
		 * Map<String, String> map = new HashMap(); 
		 * map.put("hello", "你好");
		 * map.put("how are you", "吃了没？");
		 * System.out.println((String)map.get("hello"));
		 * System.out.println((String)map.get("how are you"));
		 * 
		 * List<Integer> list = Arrays.asList(new Integer[] {
		 * Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3),
		 * Integer.valueOf(4) }); 
		 * int sum = 0; 
		 * for (Iterator localIterator = list.iterator(); localIterator.hasNext();) { 
		 *   int i =((Integer)localIterator.next()).intValue(); 
		 *   sum += i;
		 *  }
		 * System.out.println(sum);
		 */
	}
}
