import java.util.*;
// 阶乘计算
public class Test8{
	public static void main(String[] args) {
		System.out.println("输入n：");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int i = num1;
		int much = 1;
		int total = 0;
		int num = 0;
		while(i > 0){
			num = i;
			much = 1;
			while(num > 0){
				much = much * num;
				num--;
			}
			i--;
			total += much;
		}
		if(num1 > 2)
			total -= 1;
		System.out.println(total);
	}
}