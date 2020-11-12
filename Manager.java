import java.util.*;
import java.lang.reflect.*;
public class Manager extends Employee{
	private int cash;

	public Manager(String name, int salary){
		super(name, salary);
		cash = 800;
	}

	public Manager(){
		cash = 800;
	}

	// public void setBonus(int bonus){
	// 	this.bonus = bonus;
	// }

	int getMoney(){
		// System.out.println(cash + super.getTotalSalary());
		return cash + super.getTotalSalary();
	}

	public static void main(String[] args) {
		Object obj = new Manager("BigBoss", 5000);
		Employee e = new Employee("LeeSin");
		Manager ma = new Manager();
		// Employee m2 = new Manager();
		// m2.setID();
		// System.out.println(m2.getID());
		System.out.println(ma.getID() +" " + ma.getTotalSalary() +" "+ ma.getMoney() +" "+ ma.getName());
		ma.setName("Cosack");
		System.out.println(ma.getID() +" " + ma.getTotalSalary() +" "+ ma.getMoney() +" "+ ma.getName());

		e.setBonus(505);
		Manager boss = (Manager)obj;
		boss.setBonus(1000);
		// Manager boss = new Manager("BigBoss", 10000);
		
		System.out.println("老板的ID总薪资" + boss.getID() +" "+ boss.getMoney() + " 李青先生的ID总薪资" + e.getID()+" "+e.getTotalSalary());
		String name;
		if(args.length > 0)
			name = args[0];
		else{
			Scanner in = new Scanner(System.in);
			name = in.next();
		}

		try{
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			// printConstructors(cl);
			System.out.println(cl +"\n "+ supercl +"\n "+ modifiers);
			// printMethods(cl);
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		System.exit(0);
	}
}