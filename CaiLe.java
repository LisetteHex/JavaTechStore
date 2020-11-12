public class CaiLe{
	// 用蔡乐公式根据当前日期计算星期
	public String CaculateWeekDay(int y, int m, int d)
	{
		if(m == 1){
			m = 13;
			y--;
		}
		if(m == 2){
			m = 14;
			y--;	
		} 
		int week = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
		String weekstr = new String();
		switch(week)
		{
			case 0: weekstr = "星期一"; break;
			case 1: weekstr = "星期二"; break;
			case 2: weekstr = "星期三"; break;
			case 3: weekstr = "星期四"; break;
			case 4: weekstr = "星期五"; break;
			case 5: weekstr = "星期六"; break;
			case 6: weekstr = "星期日"; break;
		}
		return weekstr;
	}

	public static void main(String[] args) {
		CaiLe ca = new CaiLe();
		String week = new String();
		week = ca.CaculateWeekDay(1996, 6, 8);
		System.out.println(week);
	}
}