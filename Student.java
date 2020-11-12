public class Student{
	// 成绩判断
	private final String name;
	private float englishScore;
	private float mathScore;
	private float computerScienceScore;

	public Student(String name, float englishScore, float mathScore, float computerScienceScore){
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.computerScienceScore = computerScienceScore;
	}

	public String compareEnglish(){
		// if(englishPoint < 60){
		// 	return "英语：不及格\n";
		// }
		// else if(englishPoint < 80){
		// 	return "英语：良\n";
		// }
		// else{
		// 	return "英语：优\n";
		// }	
		switch((int)englishScore/10){
			case 6: case 7: 
			return "英语：良\n";
			case 8: case 9: case 10:
			return "英语：优\n";
			default:
			return "英语：不及格\n";
		}	
	}

	public String compareMath(){
		if(mathScore < 60){
			return "数学：不及格\n";
		}
		else if(mathScore < 80){
			return "数学：良\n";
		}
		else{
			return "数学：优\n";
		}		
	}

	public String compareComputerScience(){
		if(computerScienceScore < 60){
			return "计科：不及格\n";
		}
		else if(computerScienceScore < 80){
			return "计科：良\n";
		}
		else{
			return "计科：优\n";
		}		
	}

	public static void main(String[] args) {
		// Student[] students = new Student[3];
		Student students = new Student("Lessette", 65.3F, 95.5F, 40.9F);
		System.out.println(students.compareEnglish() + students.compareMath() + students.compareComputerScience());
	}
}