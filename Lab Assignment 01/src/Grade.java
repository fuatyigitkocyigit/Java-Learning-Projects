
public class Grade {
	double grade;
	
	public Grade(String letterGradeM){
		String letterGrade = letterGradeM;
	}
		
		public double convertLetter(String letterGrade){
			switch(letterGrade) {
			case "A+":
				grade = 4.0;
				break;
			case "A-":
				grade = 3.7;
				break;
			case "B+":
				grade = 3.3;
				break;
			case "B":
				grade = 3.0;
				break;
			case "B-":
				grade = 2.7;
				break;
			case "C+":
				grade = 2.3;
				break;
			case "C":
				grade = 2.0;
				break;
			case "C-":
				grade = 1.7;
				break;
			case "D+":
				grade = 1.3;
				break;
			case "D-":
				grade = 1.0;
				break;
			case "F":
				grade = 0;
				break;
			}
			return grade;
		}
		
		public double getGrade() {
			return grade;
		}

		public void setGrade(double grade) {
			this.grade = grade;
		}
}
	