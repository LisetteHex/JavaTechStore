public class Test11{
	// 输出100以内不能被5整除的整数
	public static void main(String[] args) {
		int i, j;
		boolean flag = false;
		for(i=1; i<=100; i++){
			if(i<5 || i%5!=0){
				System.out.print(i + " ");
			}
		}
	}
}