package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {

	private ArrayList<StudentQ> s = new ArrayList<StudentQ>();

	public void setS(ArrayList<StudentQ> s) {
		this.s = s;
	}

	public ArrayList<StudentQ> getSList() {
		return this.s;
	}

	public void selectQ() {
		boolean flag = true;
		Scanner in = new Scanner(System.in);

		while (flag) {
			System.out.println("1.학생질문추가 2.질문리스트 3.질문수정 4.전의 메뉴로 돌아가기");
			String num = in.nextLine();
			switch (num) {
			case "1":
				addQ();
				break;
			case "2":
				viewallQ();
				break;
			case "3":
				updateQ();
				break;
			case "4":
				System.out.println("전의 메뉴로 넘어갑니다");
				flag = false;
				break;
			}
		}

	}

	public void addQ() {
		StudentQ sinsert = new StudentQ();

		System.out.println("학생의 이름을 쓰시오");
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();

		for (StudentQ student : s) {
			if (student.getSname().equals(n)) {
				System.out.println("이미 존재하는 이름입니다. 다른 이름을 입력하세요.");
				return;
			}
		}

		sinsert.setSname(n);
		System.out.println("학생의 질문을 쓰시오");
		String q = in.nextLine();
		sinsert.setSQ(q);
		System.out.println("학생의 질문 날짜 등록일을 쓰시오");
		String d = in.nextLine();
		sinsert.setSdate(d);

		s.add(sinsert);

	}

	public void viewallQ() {
		for (StudentQ sinsert : s) {
			for(int i = 0; i<s.size(); i++) {
				if (s.get(i).getSname() != null) {
					sinsert.prt();
					break;
				}else {
                   System.out.println("완료");
				}
			}
			

		}
	}

	public void updateQ() {
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 쓰시오");
		String name = in.nextLine();
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getSname().equals(name)) {
				System.out.println("질문을 수정하시오");
				String SQ = in.nextLine();
				s.get(i).setSQ(SQ);

			}
		}

	}

}
