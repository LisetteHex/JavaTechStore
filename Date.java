import java.util.*;

public class Date{
	private static int year;
	private static int month;
	private static int day;
	private boolean leapYear;

	public Date(){}

	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean judgeLeapYear(int year){
		if(year%100==0 && year%400==0){
			return true;
		}
		else if(year%4==0 && year%100!=0){
			return true;
		}
		else
			return false;
	}

	public Date(boolean leapYear){
		this(year, month, day);
		this.leapYear = leapYear;
	}

	public int getYear(){
		return year;
	} 
}