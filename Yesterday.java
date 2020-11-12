//给出日期，返回前一天
public class Yesterday{
	private int year;
	private int month;
	private int day;

	public Yesterday(){
	}

	public Yesterday(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}



	public static void main(String[] args) {
		Yesterday ye = new Yesterday(2020, 4, 1);
		int day = 0;
		if(ye.getDay() > 1){
			day = ye.getDay() - 1;
			System.out.println(ye.getYear() + " " + ye.getMonth() + " " + day);
		}
		else if(ye.getDay() == 1){
			if(ye.getMonth() == 1){
				System.out.println((ye.getYear()-1) + " " + 12 + " " + 31);
				return;
			}
			else{
				switch(ye.getMonth() - 1){
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					day = 31; break;
					case 4: case 6: case 9: case 11:
					day = 30; break;
					case 2:
					int year = ye.getYear();
					if(year%4==0 && year%100!=0 || year%400==0){
						day = 29;
					}
					else {
						day = 28;
					}
					break;
				}	
			}
			
			System.out.println(ye.getYear() + " " + (ye.getMonth()-1) + " " + day);

		}
	}
}