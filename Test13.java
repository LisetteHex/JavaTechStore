public class Test13{
	// 一个人1900年出生，活了70岁，经历了几个闰年？
	public static void main(String[] args) {
		int year = 1900;
		int num = 0;
		while(year <= 1970){
			if(year%4==0 && year%100!=0){
				num++;
			}
			year++;
		}
		System.out.println("一辈子经历了" + num + "个闰年");
	}
}