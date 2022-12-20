public class ResearchAssistant extends Assistant{

	public String Degree;
	
	public ResearchAssistant(String NameM, String IDM, String OfficeNumberM, String DegreeM) {
		super(NameM, IDM, OfficeNumberM,DegreeM);
		//this.Degree = DegreeM;
	}

	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String toString(){
		String Result = super.toString();
		//????
		return Result;
	}
}
