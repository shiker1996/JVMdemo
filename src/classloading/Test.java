package classloading;
/**
 * 非法向前引用变量
 * @author 尹伟丞
 *
 */
public class Test {

	static {
		i=0;
		//System.out.println(i);//提示非法向前引用Cannot reference a field before it is defined
	}
	
	static int i =1;
}
