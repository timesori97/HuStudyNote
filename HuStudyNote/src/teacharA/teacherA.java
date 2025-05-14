package teacharA;

public class teacherA {
    
	private String TA = null;
	private String Tname = null;
	public String getTA() {
		return TA;
	}
	public void setTA(String tA) {
		TA = tA;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	
	public void prt() {
		System.out.println("---------------------------------");
		System.out.println("성함 :"+this.Tname+" 답변 :"+this.TA);
		System.out.println("---------------------------------");
	}
	
}
