// 求水仙花数，水仙花数是指一个三位数（100~999），他的每个位上的数字的3次幂之和等于他本身，如153=1^3 + 5^3 + 3^3
public class Flowar{
	public static void main(String[] args) {
		int[] a = new int[3];
		int num = 100;
		while(num < 1000){
			a[0] = num / 100;
			a[1] = (num / 10) % 10;
			a[2] = num % 10;
			if(a[0]*a[0]*a[0] + a[1]*a[1]*a[1] + a[2]*a[2]*a[2] == num){
				System.out.print(num + " ");
			}
			num++; 
		}
	}
}