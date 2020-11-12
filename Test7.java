public class Test7{
	// 偶数之和
	public static void main(String[] args) {
		int i = 10;
		int total = 0;
		while(i>0){
			if(i%2==0){
				total += i;
				i--;
			}
			else {
				i--;
			}
		}
		System.out.println(total);
	}
}