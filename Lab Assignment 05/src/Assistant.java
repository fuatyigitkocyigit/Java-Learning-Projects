public class Assistant extends AcademicStaff {

	public String Degree;
	
	public Assistant(String NameM, String IDM, String OfficeNumberM, String DegreeM) {
		super(NameM, IDM, OfficeNumberM);
		this.Degree = DegreeM;
		
	}

	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}

	@Override
	public String toString() {
		String Result="";
		String result = "(" +this.getDegree()+ ") " +this.getName()+ " - " +this.getID()+ " @" +this.getOfficeNumber();
		return Result;
	}
}
