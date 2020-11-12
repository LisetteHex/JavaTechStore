public class Test10{
	// 200-300之间是素数
	public static void main(String[] args) {
		int i = 200;
		int j = 2;
		boolean flag = false;
		while(i<=300){
			for(j=2; j<i; j++){
				if(i%j==0){
					flag = true;
					break;
				}
			}
			if(flag == false){
				System.out.print(i + " ");
			}
			flag = false;
			i++;
		}
	}
}
