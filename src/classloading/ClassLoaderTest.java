package classloading;

import java.io.IOException;
import java.io.InputStream;
/**
 * 类加载器与instanceof关键字演示
 * @author 尹伟丞
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args)  throws Exception{
		ClassLoader myLoader = new ClassLoader() {
			public Class<?> loadClass(String name) throws ClassNotFoundException {

				try {
					String fileName = name.substring(name.lastIndexOf(".") + 1)
							+ ".class";
					InputStream is = getClass().getResourceAsStream(fileName);
					if (is == null) {
						return super.loadClass(name);
					}
					byte[] b = new byte[is.available()];
					is.read(b);
					return defineClass(name, b, 0, b.length);
				} catch ( IOException e) {
					// TODO Auto-generated catch block
					throw new ClassNotFoundException(name);
				}
			}
		};
		
		Object obj =  myLoader.loadClass("classloading.ClassLoaderTest").newInstance();
		System.out.println(obj.getClass());
		System.out.println(obj instanceof classloading.ClassLoaderTest);
	}
}
