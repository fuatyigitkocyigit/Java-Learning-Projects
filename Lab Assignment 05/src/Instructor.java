public class Instructor extends AcademicStaff{

	public String Title;

	public Instructor(String NameM, String IDM, String OfficeNumberM, String TitleM) {
		super(NameM, IDM, OfficeNumberM);
		this.Title = TitleM;
	}

	public boolean assignCourse(Course CourseM) {
		if(this.Courses.size()<3) {
			CourseM.setLecturer(this);
			return super.assignCourse(CourseM);
		}
		else {
			System.out.println(this.getID()+" - "+this.getName()+" cannot teach more than 3 courses.");
			return false;
		}
	}

	public String getTitle() {
		return Title;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	@Override
	public String toString() {
		String Result = this.getTitle()+ " " +this.getName()+ " - " +this.getID()+ " @" +this.getOfficeNumber();
		for (int i=0; i<Courses.size(); i++) {
			if(Courses.get(i).getYear()==Driver.theyear)
				Result = Result+ "\n" +Courses.get(i).getCourseCode()+ " - " +Courses.get(i).getCourseName();
		}
		for(int i=0; i<Courses.size(); i++) {
			
			
			
		}
		return Result;
	}
	
}
