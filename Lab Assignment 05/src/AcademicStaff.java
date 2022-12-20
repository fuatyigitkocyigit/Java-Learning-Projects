import java.util.ArrayList;
public class AcademicStaff extends Member {

	public String OfficeNumber;
	
	public AcademicStaff(String NameM, String IDM, String OfficeNumberM) {
		super(NameM, IDM);
		this.OfficeNumber = OfficeNumberM;
	}
	
	public boolean assignCourse(Course CourseM) {
		boolean already = false;
		for (int i=0; i<CourseIDs.size(); i++) {
			if(CourseIDs.get(i).equals(CourseM.getCourseCode()))
				already = true;
		}
		if(already==true) {
			if(this.getClass() == TeachingAssistant.class)
				System.out.print("TA ");
			else if(this.getClass() == Instructor.class)
				System.out.print("Instructor ");
			System.out.println(this.getName()+" is already teaching "+CourseM.getCourseCode()+" - "+CourseM.getCourseName()+".");
			return false;
		}
		else
			return super.assignCourse(CourseM);
	}
	
	public String getOfficeNumber() {
		return OfficeNumber;
	}
	public void setOfficeNumber(String OfficeNumber) {
		this.OfficeNumber = OfficeNumber;
	}
	
}
