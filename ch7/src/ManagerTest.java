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
		lee.name = "�̲ҵ�";
		lee.jobOfManage = "�λ����";
		System.out.println
		(lee.name + "��" + lee.jobOfManage+ "����Դϴ�");
		lee.test();
		lee.print();
	

	}

}
