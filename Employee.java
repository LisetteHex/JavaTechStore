public class Employee implements Lambda<Employee>{
	private String name;
	private int id;
	private static int nextID = 10085;
	private int salary;
	private int bonus = 0;

	public Employee(){
		this.name = "";
		this.id = 0;
		this.salary = 4000;
		this.bonus = 0;
	}

	public Employee(String name){
		this.name = name;
		this.id = nextID;
		nextID++;
		this.salary = 4000;
		this.bonus = 0;
	}
	
	public Employee(String name, int salary){
		this.name = name;
		this.id = nextID;
		nextID++;
		this.salary = salary;
		this.bonus = 0;
	}
	// 构造器
	public void setName(String name){
		this.name = name;
		this.id = nextID;
		nextID++;
	
	}

	public String getName(){
		return name;
	}
	// 域访问器

	int getID(){
		return id;
	}

	int getSalary(){
		return salary;
	}

	public void setBonus(int bonus){
		this.bonus = bonus;
	}

	public int getBonus(){
		return bonus;
	}

	public int getTotalSalary(){
		return bonus + salary;
	}

	public int compareTo(Employee other){
		return Double.compare(salary, other.salary);
	}



	public static void main(String[] args) {
		Employee staff = new Employee("LeeSin");
		Employee staff2 = new Employee("Lessette");
		Employee staff3 = new Employee("Hex");
		staff.setBonus(1000);
		staff2.setBonus(2000);
		// int i = staff.getMoney();
		System.out.println(staff.getName() + " ID：" + staff.getID() + " 薪资：" + staff.getSalary() + " 奖金：" + staff.getBonus());
		System.out.println(staff2.getName() + " ID：" + staff2.getID() + " 薪资：" + staff2.getSalary() + " 奖金：" + staff2.getBonus());
		System.out.println(staff3.getName() + " ID：" + staff3.getID() + " 薪资：" + staff3.getSalary() + " 奖金：" + staff3.getBonus());
		System.out.println(staff2.getName() + "的总薪资是" + staff2.getTotalSalary() + "元");
	}
}