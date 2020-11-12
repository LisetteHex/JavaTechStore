import java.util.*;
// 判断月份日期
public class Test6{
	private int year;
	private int month;

	public Test6(int year, int month){
		this.year = year;
		this.month = month;
	}

	public boolean compareYear(int year){
		if(year%4==0 && year%100!=0){
			return true; 
		}
		else 
			return false;
	}

	public int compareMonth(boolean flag, int month){
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
			case 4: case 6: case 9: case 11:
			return 30;
			case 2:
			if(flag == true){
				return 29;
			}
			else{
				return 28;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("输入年份：");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		System.out.println("输入月份：");
		int month = in.nextInt();
		Test6 test = new Test6(year, month);
		boolean flag = test.compareYear(year);
		System.out.println(year + "年" + month + "月有" + test.compareMonth(flag, month) + "天");
	}
}