
public class Employee {
	int empNum;
	String name;
	int baseSalary;
	int soodang;
	public Employee(int i, String n, int b, int g) {
		empNum = i;
		name = n;
		baseSalary = b;
		soodang = g;
	}
	void print(){
		int sal = baseSalary + soodang;
		System.out.println("���: " + empNum);
		System.out.println("�̸�: " + name);
		System.out.println("�޿�: " + sal);
	}

}
