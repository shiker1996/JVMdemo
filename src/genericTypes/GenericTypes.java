package genericTypes;

import java.util.ArrayList;
import java.util.List;

public class GenericTypes {

	/**
	 * 
	 * @return
	错误信息Method method(List<String>) has the same erasure(擦除) 
	method(List<E>) as another method in type GenericTypes
	public static void method(List<String> list){
		System.out.println("List<String> list");
	}
	
	public static void method(List<Integer> list){
		System.out.println("List<Integer> list");
	}
	
	 */
}
