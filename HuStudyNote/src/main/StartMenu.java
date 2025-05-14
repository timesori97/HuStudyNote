package main;

import java.util.ArrayList;
import java.util.Scanner;

import completionQA.Cqa;
import student.Question;
import teacharA.Answer;

public class StartMenu {
	 private Question q = new Question();
	    private Answer a = new Answer();
	    private Cqa c;
	   

	    // 생성자를 통해 Cqa 객체를 주입 받음
	    public StartMenu() {
	        this.c = new Cqa(this); // 현재 StartMenu 인스턴스를 Cqa 생성자로 전달
	        startMenu();
	    }

	    private void startMenu() {
	        boolean flag = true;
	        Scanner in = new Scanner(System.in);
	        
	        while (flag) {
	            System.out.println("1.학생 2.선생님 3.답변 완료 리스트 4.종료");
	            String num = in.nextLine();
	            switch (num) {
	                case "1":
	                    q.selectQ();
	                    break;
	                case "2":
	                    a.selectA(q, c);
	                    break;
	                case "3":
	                	cview();
	                	break;
	                case "4":
	                    System.out.println("시스템을 종료합니다");
	                    flag = false;
	                    break;
	                default:
	                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
	            }
	        }
	        in.close(); 
	    }
	    
	    public void cview() {
	        for (Cqa completed : c.getCompletedList()) {
	            completed.prt(); 
	        }
	    }
	  
	
	
	  



	public void setC(Cqa c) {
		this.c = c;
	}




	public Question getQ() {
		return q;
	}




	public void setQ(Question q) {
		this.q = q;
	}




	public Answer getA() {
		return a;
	}




	public void setA(Answer a) {
		this.a = a;
	}




	
	
	
}
