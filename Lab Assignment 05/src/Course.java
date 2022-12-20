import java.util.ArrayList;
public class Course {

	public String CourseCode;
	public String CourseName;
	public int Year;
	public String Semester;
	public int Capacity;
	public ArrayList<TeachingAssistant> Assistants;
	public ArrayList<Student> Students;
	public Instructor Lecturer;
	
	public Course(String CourseCodeM, String CourseNameM, String YearM, String SemesterM, String CapacityM) {
		this.CourseCode = CourseCodeM;
		this.CourseName = CourseNameM;
		this.Year = Integer.parseInt(YearM);
		this.Semester = SemesterM.toUpperCase();
		this.Capacity = Integer.parseInt(CapacityM);
		this.Assistants = new ArrayList<TeachingAssistant>();
		this.Students = new ArrayList<Student>();
	}
	
	public boolean addStudent(Student StudentM) {
		if(this.Students.size()+1 > this.Capacity) {
			System.out.println(this.CourseName+" is full.");
			return false;
		}
		else{
			this.Students.add(StudentM);
			return true;
		}
	}
	
	public String getCourseCode() {
		return CourseCode;
	}
	public void setCourseCode(String CourseCode) {
		this.CourseCode = CourseCode;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int Capacity) {
		this.Capacity = Capacity;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int Year) {
		this.Year = Year;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String Semester) {
		this.Semester = Semester;
	}
	public Instructor getLecturer() {
		return Lecturer;
	}
	public void setLecturer(Instructor Lecturer) {
		this.Lecturer = Lecturer;
	}
	public ArrayList<TeachingAssistant> getAssistants() {
		return Assistants;
	}
	public void setAssistant(ArrayList<TeachingAssistant> Assistants) {
		this.Assistants = Assistants;
	}
	public ArrayList<Student> getStudents() {
		return Students;
	}
	public void setStudents(ArrayList<Student> Students) {
		this.Students = Students;
	}
	@Override
	public String toString() {
		String Result = CourseCode+ " - " +CourseName+ " - " + Year + Semester.toUpperCase()+ "\nCapacity: " +Capacity+ "\nLecturer: ";
		if(Lecturer==null)
			Result = Result+ "Not Assigned Yet.";
		else
			Result = Result+ Lecturer.getTitle()+" "+Lecturer.getName();
		Result = Result+ "\nTeaching Assistants: "; 
		if(Assistants.size()==0)
			Result = Result+ "None";
		else
			for(TeachingAssistant ta : Assistants) {
				Result = Result+ "\n"+ta.getName();
			}
		if(this.Students.size()>0) {
			Result = Result+ "\nRoster: "+this.Students.get(0).getName();
			for(int i = 1; i<this.Students.size(); i++) {
				Result = Result+ ", "+this.Students.get(i).getName();
			}
		}
		return Result;
	}
}
