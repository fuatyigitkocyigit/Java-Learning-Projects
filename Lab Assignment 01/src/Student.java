
public class Student {
	Grade[] Grades = new Grade[4];
	String Name;
	String StudentID;
	int GradeCount;
	
	public Student(String NameM, String StudentIDM) {
		this.Name = NameM;
		this.StudentID = StudentIDM;
		Grade[] Grades = new Grade[4];
		this.GradeCount = 0;
		
		for (int i = 0; i < Grades.length; i++) {
			this.Grades[i]= new Grade(" ");
			}
	}
	
		
	public boolean addGrade (String letterGrade) {
			if(GradeCount < 4) {
				Grades[GradeCount].convertLetter(letterGrade);
				GradeCount++;
				return true;
			}
			else
				return false;
			
		}
		
		public boolean removeGrade (int index) {
			if(GradeCount > 0 && index < GradeCount) {
				this.Grades[index]=new Grade("");
				GradeCount--;
				for (int i = index; i < Grades.length-1; i++) {
					this.Grades[i].setGrade(this.Grades[i+1].getGrade());
					}
				return true;
			}
			else
				return false;
			
		}
		
		public String printGrades() {
			String a="";
			for (int i = 0; i < this.GradeCount; i++)
			a = a+ " "+this.Grades[i].getGrade();
			
			return a;
		}
		
		public double averageGrade() {
			double total=0;
			for(int i=0; i < this.GradeCount; i++) {
			double x = this.Grades[i].getGrade();
			total = total+x;
			}
			double avarage = total/this.GradeCount;
			return avarage;
			
		}
		
		public String toString( ) {
			return this.Name+"("+this.StudentID+")";
					
		}

	public Grade[] getGrades() {
		return Grades;
	}

	public void setGrades(Grade[] grades) {
		Grades = grades;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public int getGradeCount() {
		return GradeCount;
	}

	public void setGradeCount(int gradeCount) {
		GradeCount = gradeCount;
	}
}
