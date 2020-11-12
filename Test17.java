public class Test17 extends Test16{
	public void methodB(){
		int n = 20;
		String name = "name";
		methodA(n, name);
	}
	//方法的重写 父类是public 子类不能是private
	public static void main(String[] args) {
			Test17 ts = new Test17();
			ts.methodB();
	}
}