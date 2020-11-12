import java.util.*;
public class Test2{
	public static void main(String[] args) {
		// String a = "";
		// String b = "";
		System.out.println("input the first num");
		Scanner scanA = new Scanner(System.in);
		int a = scanA.nextInt();
		System.out.println("input the next num");
		Scanner scanB = new Scanner(System.in);
		int b = scanB.nextInt();
		Test1 t = new Test1();
		// int i = (int)a;
		// int j = (int)b;
		int total = t.sum(a, b);
		System.out.println(total);
	}
}