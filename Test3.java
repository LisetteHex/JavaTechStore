public class Test3{
	public static void main(String[] args) {
		int a = 257;
		byte b = (byte)a;
		char c1 = 'A', c2;
		int i;
		i = (int)c1 + 1;
		c2 = (char)i;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println(c1 + c2);
		System.out.println(c1 + "," + c2);
	}
}