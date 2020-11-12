// 使用循环语句计算1+1/2!+1/3!+...+1/20!的值
// 求水仙花数，水仙花数是指一个三位数（100~999），他的每个位上的数字的3次幂之和等于他本身，如153=1^3 + 5^3 + 3^3
// 杨辉三角
// 给出日期，返回前一天
public class Factorial{
	public long factorial(long num){
		if(num < 1){
			
			return 1;
		}
		else{
			return num * factorial(num - 1);
		}
	}

	public float addThemAll(long[] a){
		int i = a.length - 1;
		float sum = 0f;
		while(i >= 0){
			sum += 1/a[i];
			i--;
		}
		return sum;
	}

	public static void main(String[] args) {
		long[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		Factorial fa = new Factorial();
		int i = a.length - 1;
		System.out.println(a[i]);
		long b = 0;
		// b = a[i];
		// a[i] = fa.factorial(b);
		// System.out.println(a[i]);
		while(i >= 0){
			// b = a[i];
			// a[i] = fa.factorial(b);
			a[i] = fa.factorial(a[i]);
			System.out.println(a[i]);
			i--;
		}
		System.out.println(fa.addThemAll(a));
		
	}
}