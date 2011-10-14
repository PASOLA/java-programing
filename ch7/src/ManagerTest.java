class Employee{
	String name;
	int number;
	int age;
	String title;
	String dept;
	String grade;	
	
	void print(){
		System.out.println(name + " :  + age");
	}
}

class Manager extends Employee{

	void test(){
		System.out.println(number); 
	}
	String jobOfManage;
	String boss;
	String[] subordinate;
}
class ManagerTest {
	public static void main(String[] args) {
		Manager lee = new Manager();
		lee.name = "이꾀돌";
		lee.jobOfManage = "인사관리";
		System.out.println
		(lee.name + "은" + lee.jobOfManage+ "담당입니다");
		lee.test();
		lee.print();
	

	}

}
