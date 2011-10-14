
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
		System.out.println("사번: " + empNum);
		System.out.println("이름: " + name);
		System.out.println("급여: " + sal);
	}

}
