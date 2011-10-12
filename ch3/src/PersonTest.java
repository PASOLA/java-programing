class Person{
	
   String name;
   int age;
   static String nation = "대한민국";
   
}
public class PersonTest{	
	public static void main(String[] args) {
	    System.out.println(Person.nation);
	    System.out.println("원주율변수 =" + Math.PI);
	    System.out.println("int 최대값 변수 =" + Integer.MAX_VALUE);
	    System.out.println("int 최소값 변수 =" + Integer.MIN_VALUE);
		Person p1 = new Person();
		p1.name = "이자비";
		p1.age = 27;
		p1.nation = "대한민국";
			System.out.println
			("p1이 참조하는 객체의 이름은 " + p1.name + p1.nation +"입니다");

	}

}
