public class Week{
	private String Monday = "星期一";
	private String Tuesday = "星期二";
	private String Wednesday = "星期三";
	private String Thursday = "星期四";
	private String Firday = "星期五";
	private String Saturday = "星期六";
	private String Sunday = "星期日";
	// private String[] week;

	public String[] setWeek(){
		String[] week = new String[7];
		week[0] = Monday;
		week[1] = Tuesday;
		week[2] = Wednesday;
		week[3] = Thursday;
		week[4] = Firday;
		week[5] = Saturday;
		week[6] = Sunday;
		return week;
	}

	public static void main(String[] args) {
		Week week = new Week();
		String[] we = week.setWeek();
		for(int i=0; i<7; i++){
			System.out.println(we[i]);	
		}
		
	}
}