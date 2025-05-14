package teacharA;

import java.util.ArrayList;
import java.util.Scanner;

import completionQA.Cqa;
import student.Question;
import student.StudentQ;

public class Answer {
    private ArrayList<teacherA> t = new ArrayList<teacherA>();
    
    
	
	

	public ArrayList<teacherA> getT() {
		return t;
	}

	public void setT(ArrayList<teacherA> t) {
		this.t = t;
	}

	public void selectA(Question q,Cqa c) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("1.답변 등록 2.전의 메뉴로 돌아가기");
			String num = in.nextLine();
			switch(num) {
			case"1":
				add(q,c);
				break;
			case"2":
				System.out.println("이전 메뉴로 갑니다");
				flag = false;
				break;
			}
			
		}
	}
	
	public void add(Question q,Cqa c) {
		Scanner in = new Scanner(System.in);
		teacherA tinsert = new teacherA();
		boolean tt = true;
		for(int i = 0; i<q.getSList().size(); i++) {
		        	 System.out.println("이름 : "+q.getSList().get(i).getSname()+" 질문 :"+q.getSList().get(i).getSQ());	 	 
		         }
				 System.out.println("답변할 학생명을 작성하세요");
				 String name = in.nextLine();
				 for(int i = 0; i<q.getSList().size(); i++) {
					 if(q.getSList().get(i).getSname().equals(name)) {
						 System.out.println("선생님의 이름을 쓰시오");
							String n = in.nextLine();
							tinsert.setTname(n);
							System.out.println("선생님의 답변을 쓰시오");
							String y = in.nextLine();
							tinsert.setTA(y);
							if(tt == true) {
								tt = false;
								
							}
							
					 }
				 }
				if(tt == false) {
					t.add(tinsert);
				}
				c.remove(name);
			
		
	}
	public void viewlist() {
		for(teacherA tinsert : t) {
			if(t != null) {
				tinsert.prt();	
			}
			
		}
		
	}
	public void QAview(Question q) {
		if(t != null) {
			for(int i = 0; i<q.getSList().size(); i++) {
				park:for(int j = 0; j<t.size(); j++) {
					if(i==j) {
						System.out.println("학생이름 :"+q.getSList().get(i).getSname() + " 학생 질문 :"+q.getSList().get(i).getSQ() +
								"               선생님 성함 :"+t.get(j).getTname() + " 선생님 답변 : "+t.get(j).getTA());	
						break park;
					}
					
				}
			}
		}
			
		}
		
	
	
	
}
