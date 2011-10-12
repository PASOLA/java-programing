
public class day2 {
	public static void main(String[] args) {
		Student s1 = new Student(args[0], args[1],Integer.parseInt(args[2]));
		s1.courseFee = Integer.parseInt(args[2]);
		System.out.println("이름:" + s1.name);
		System.out.println("소속:" + s1.dept);
		System.out.println("과정명:" + s1.course);
		System.out.println("교육비:" + s1.courseFee);
		System.out.print("환급금:" );
		
		if(s1.course.equals("자바프로그래밍")){
			s1.refund = s1.courseFee *0.25+s1.add;
			System.out.println(s1.refund);
		}
		else if(s1.course.equals("JDBC프로그래밍")){
			s1.refund = s1.courseFee *0.2+s1.add;
			System.out.println(s1.refund);
		}
		else if(s1.course.equals("JSP프로그래밍")){
			s1.refund = s1.courseFee *0.1+s1.add;
			System.out.println(s1.refund);
		}
		else {
			System.out.println("잘못 입력되었습니다");
			return;
		}	
	}

}

class Student{
	Student(String name, String course, int courseFee ){
		this.name = name;
		this.course = course;
		this.courseFee = courseFee;		   
	}
	String name;
	static String dept = "삼성멀티캠퍼스";
	String course;
	int courseFee;
	double refund;
	final static int add = 5000;
}
