package hsdis;
/**
 * HSDIS:JIT生成反代码汇编
 * java -XX:+UnlockDIagnosticVMOptions -XX:+PrintAssembly 
 * -Xcomp -XX:CompileCommand=dontinline,*Bar.sum 
 * -XXCompileCommand=compileonly,*Bar.sum hsdis.Bar
 * @author 尹伟丞
 *
 */
public class Bar {

	int a=1;
	static int b=2;
	
	public int sum(int c){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		new Bar().sum(3);
	}
}
