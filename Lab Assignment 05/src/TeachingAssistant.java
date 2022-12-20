public class TeachingAssistant extends Assistant{

	public String Degree;
	
	public TeachingAssistant(String NameM, String IDM, String OfficeNumberM, String DegreeM) {
		super(NameM, IDM, OfficeNumberM,DegreeM);
		this.Degree = DegreeM;
	}
	
	public boolean assignCourse(Course CourseM) {
		if(super.assignCourse(CourseM)) {
			CourseM.getAssistants().add(this);
			return true;
		}
		else
			return false;
	}
	
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String Degree) {
		this.Degree = Degree;
	}
	@Override
	public String toString() {
		String Result = "("+Degree+") "+this.getName()+" - "+this.getID()+" @"+this.getOfficeNumber();
		for (int i=0; i<Courses.size(); i++) {
			if(Courses.get(i).getYear()==Driver.theyear)
				Result = Result+ "\n" +Courses.get(i).getCourseCode()+ " - " +Courses.get(i).getCourseName();
		}
		return Result;
	}
	
}
