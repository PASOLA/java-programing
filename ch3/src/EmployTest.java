
public class EmployTest {
	public static void main(String[] args) {
	
		Employee hong = new Employee("ȫ�浿",20);
//		hong.name = "ȫ�浿";
//		hong.age = 20;
		hong.print();
//		System.out.println
//		("����� �̸��� " + hong.name + "�̰�,���̴�" + hong.age + "�Դϴ�");
		
		Employee me = new Employee("���ڹ�");
//		me.name = "���ں�";
//		me.age = 30;
		me.print();
//		System.out.println
//		("�ι�°����� �̸��� " + me.name + "�̰�,���̴�" + me.age + "�Դϴ�");
		
		Employee you = new Employee();
		you.print();
	}

}

class Employee{
	
	void print (){
		System.out.println
		("����� �̸���"+ name + "�̰� ���̴� "+ age + "�Դϴ�.");
	}
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	Employee(String n){
		name = n;
		age = -1;
		
	}
	Employee(){
		
	}

	String name;
	int age;
	
}
