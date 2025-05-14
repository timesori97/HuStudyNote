package completionQA;

import java.util.ArrayList;

import main.StartMenu;
import student.Question;

public class Cqa {

	 private StartMenu start; // StartMenu를 직접 생성하지 않음
	 private ArrayList<Cqa> c = new ArrayList<>();
	    
	    String Csname = null;
	    String Csq = null;
	    String Csdate = null;
	    String Cta = null;
	    String Ctn = null;

	    // 생성자를 통해 StartMenu를 주입 받음
	    public Cqa(StartMenu start) {
	        this.start = start;
	    }
	    
	    public void remove(String sname) {
	        Cqa cinsert = new Cqa(start); 
	        boolean ct = true;
	        for (int i = 0; i < start.getQ().getSList().size(); i++) {
	            for (int j = 0; j < start.getA().getT().size(); j++) {
	                if (i == j) {
	                    cinsert.setCsname(start.getQ().getSList().get(i).getSname());
	                    cinsert.setCsq(start.getQ().getSList().get(i).getSQ());
	                    cinsert.setCsdate(start.getQ().getSList().get(i).getSdate());

	                    cinsert.setCtn(start.getA().getT().get(j).getTname());
	                    cinsert.setCta(start.getA().getT().get(j).getTA());
	                    if (ct) {
	                        ct = false;
	                    }
	                }
	            }
	        }
	        if (!ct) {
	            c.add(cinsert);
	        }
		
	        for(int a=0;a<start.getQ().getSList().size();a++) {
	        	if(start.getQ().getSList().get(a).getSname().equals(sname)) {
	        		start.getQ().getSList().remove(a);
	        		break;
	        	}
			
		}
					
			
		
		
	}
	    
	    
    public void prt() {
        System.out.println("----------------------------");
    	System.out.println("학생이름 : "+this.Csname);
    	System.out.println("질문 : "+this.Csq);
    	System.out.println("등록일 : "+this.Csdate);
 
    	System.out.println("성생님 성함 : "+this.Ctn);
    	System.out.println("답변 : "+this.Cta);
    	System.out.println("----------------------------");
    }
	

	public String getCsname() {
		return Csname;
	}


	public void setCsname(String csname) {
		Csname = csname;
	}


	public String getCsq() {
		return Csq;
	}


	public void setCsq(String csq) {
		Csq = csq;
	}


	public String getCsdate() {
		return Csdate;
	}


	public void setCsdate(String csdate) {
		Csdate = csdate;
	}


	public String getCta() {
		return Cta;
	}


	public void setCta(String cta) {
		Cta = cta;
	}


	public String getCtn() {
		return Ctn;
	}


	public void setCtn(String ctn) {
		Ctn = ctn;
	}

	public ArrayList<Cqa> getCompletedList() {
        return c;
    }


	
	
}
