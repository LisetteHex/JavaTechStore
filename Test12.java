import java.util.*;
// 根据输入x的值输出y
public class Test12{
	public static void main(String[] args) {
		int x, y;
		System.out.println("输入x：");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		if(x>0){
			System.out.println("y = " + (x+3));
		}
		else if(x==0){
			System.out.println("y = " + x);
		}
		else{
			System.out.println("y = " + (x*x-1));
		}
	}
}