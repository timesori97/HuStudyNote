package student;

public class StudentQ {

	private String Sname = null;
	private String SQ = null;
	private String Sdate = null;
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSQ() {
		return SQ;
	}
	public void setSQ(String sQ) {
		SQ = sQ;
	}
	public String getSdate() {
		return Sdate;
	}
	public void setSdate(String sdate) {
		Sdate = sdate;
	}
	
	public void prt() {
	    System.out.println("---------------------------");
		System.out.println("학생이름 :"+this.Sname);
		System.out.println("질문 :"+this.SQ);
		System.out.println("등록날짜 :" + this.Sdate);
	    System.out.println("---------------------------");
	}
	
	
}
