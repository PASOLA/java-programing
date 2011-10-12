
public class EmployTest {
	public static void main(String[] args) {
	
		Employee hong = new Employee("홍길동",20);
//		hong.name = "홍길동";
//		hong.age = 20;
		hong.print();
//		System.out.println
//		("사원의 이름은 " + hong.name + "이고,나이는" + hong.age + "입니다");
		
		Employee me = new Employee("이자바");
//		me.name = "이자비";
//		me.age = 30;
		me.print();
//		System.out.println
//		("두번째사원의 이름은 " + me.name + "이고,나이는" + me.age + "입니다");
		
		Employee you = new Employee();
		you.print();
	}

}

class Employee{
	
	void print (){
		System.out.println
		("사원의 이름은"+ name + "이고 나이는 "+ age + "입니다.");
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
