import java.util.*;

public class FullYears{
	private static Date theYear;
	private int estimatedDays = 0;
	private int much = 0;
	// private int deltaYear;

	public FullYears(Data theYear){
		this.theYear = theYear;
	}

	public int daysInfo(Date theYear){
		int year = theYear.getYear();
		int deltaYear = 0;
		if(year > 1){
			deltaYear = year - 1 - 1;	
		}
		else {
			return 0;
		}
		estimatedDays = deltaYear * 365;
		return estimatedDays;
	}

	public int leapYearInfo(Date theYear){
		int i = theYear.getYear();
		if(i > 1){
			while(i>1){
				if(theYear.judgeLeapYear(i)){
					much++;
				}
				i--;
			}
		}
		else {
			return 0;
		}
		return much;
	}

	public int exactDaysInfo(int estimatedDays, int much){
		return estimatedDays + much;
	}

	public static void main(String[] args) {
		Date date = new Date(1900, 1, 1);
		FullYears fy = new FullYears(data);
		fy.daysInfo(date);
		fy.leapYearInfo(date);
		int days = fy.exactDaysInfo(fy.estimatedDays, fy.much);
		Week week = new Week();
		days = days % 7;
		String[] we = week.setWeek();
		System.out.println(we[days]);
	}
	 
}