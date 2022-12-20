public class Student extends Member{

	String Year;
	
	public Student(String NameM, String IDM, String YearM) {
		super(NameM, IDM);
		this.Year = YearM;
	}
	
	public boolean assignCourse(Course CourseM) {
		if(CourseM.addStudent(this))
			return super.assignCourse(CourseM);
		else
			return false;
	}
	
	public String getYear() {
		return Year;
	}
	public void setYear(String Year) {
		this.Year = Year;
	}
	@Override
	public String toString() {
		String Result = this.Year+ " " +this.getName()+ " - " +this.getID();
		if(this.Courses.size()> 0) {
			Result = Result+ "\nCourses: ";
			String CourseResult = "";
			for (int i=0; i<Courses.size(); i++) {
				if(Courses.get(i).getYear()==Driver.theyear)
					CourseResult = CourseResult+ ", "+ Courses.get(i).getCourseCode();
			}
			Result = Result + CourseResult.substring(2);
		}
		return Result;
	}
	
}
