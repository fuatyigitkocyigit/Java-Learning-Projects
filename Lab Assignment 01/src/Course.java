
public class Course {

	String CourseCode, day;
	int studentCount, Capacity;
	double averageGrade;
	
	public Course(String CourseCodeM, int CapacityM,  String dayM, int studentCountM, double averageGradeM) {
	
		this.CourseCode = CourseCodeM;
		this.Capacity = CapacityM;
		this.day = dayM;
		this.studentCount = studentCountM;
		this.averageGrade = averageGradeM;
	}
		
	public boolean addGrade (double gradeM) {
		if(this.studentCount==this.Capacity)
			return false;
		
		else {
			this.averageGrade = (this.studentCount*this.averageGrade + gradeM)/(this.studentCount+1);
			studentCount++;
		return true;
		}
		
	}
	
	public boolean removeGrade (double gradeM) {
		if(this.studentCount==0)
			return false;
		else if(this.studentCount!=1)
			this.averageGrade = (this.studentCount*this.averageGrade - gradeM)/(this.studentCount-1);
		else
			this.averageGrade = 0;
		this.studentCount--;
		return true;
		}
	
	public String toString( ) {
		return CourseCode;
		
	}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
}
