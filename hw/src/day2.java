
public class day2 {
	public static void main(String[] args) {
		Student s1 = new Student(args[0], args[1],Integer.parseInt(args[2]));
		s1.courseFee = Integer.parseInt(args[2]);
		System.out.println("�̸�:" + s1.name);
		System.out.println("�Ҽ�:" + s1.dept);
		System.out.println("������:" + s1.course);
		System.out.println("������:" + s1.courseFee);
		System.out.print("ȯ�ޱ�:" );
		
		if(s1.course.equals("�ڹ����α׷���")){
			s1.refund = s1.courseFee *0.25+s1.add;
			System.out.println(s1.refund);
		}
		else if(s1.course.equals("JDBC���α׷���")){
			s1.refund = s1.courseFee *0.2+s1.add;
			System.out.println(s1.refund);
		}
		else if(s1.course.equals("JSP���α׷���")){
			s1.refund = s1.courseFee *0.1+s1.add;
			System.out.println(s1.refund);
		}
		else {
			System.out.println("�߸� �ԷµǾ����ϴ�");
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
	static String dept = "�Ｚ��Ƽķ�۽�";
	String course;
	int courseFee;
	double refund;
	final static int add = 5000;
}
