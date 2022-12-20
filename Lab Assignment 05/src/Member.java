import java.util.ArrayList;
public class Member {

	public String Name,ID;
	public ArrayList<Course> Courses = new ArrayList();
	public ArrayList CourseIDs = new ArrayList();
	
	public Member(String NameM, String IDM) {
		this.Name = NameM;
		this.ID = IDM;
	}
	
	public boolean assignCourse(Course CourseM) {
		Course addC = CourseM;
			Courses.add(addC);
			CourseIDs.add(CourseM.getCourseCode());
			System.out.println("success");
			return true;
		//else { //(CourseM.getCapacity()<=0)
			//System.out.println(CourseM.getCourseName()+ " is full.");
			//return false;
		//}
	}
	
	public ArrayList getCourseIDs() {
		return CourseIDs;
	}
	public void setCourseIDs(ArrayList courseIDs) {
		CourseIDs = courseIDs;
	}
	public void setCourses(ArrayList<Course> courses) {
		Courses = courses;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		ID = ID;
	}
}
