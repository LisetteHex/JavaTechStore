public class Test16{
	private int a;

	public Test16(int a){
		this.a = a;
		System.out.println(a);
	}

	public void methodA(int n, String name){
		System.out.println(n + " " + name);
	}

	public void methodB(){
		int n = 10;
		String s = "name";
		methodA(n, s);
	}
	//静态方法调用外部方法，传参数
	public static void main(String[] args) {
		Test16 mb = new Test16(5);
		mb.methodB();
	}
}