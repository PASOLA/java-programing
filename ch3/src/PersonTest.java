class Person{
	
   String name;
   int age;
   static String nation = "���ѹα�";
   
}
public class PersonTest{	
	public static void main(String[] args) {
	    System.out.println(Person.nation);
	    System.out.println("���������� =" + Math.PI);
	    System.out.println("int �ִ밪 ���� =" + Integer.MAX_VALUE);
	    System.out.println("int �ּҰ� ���� =" + Integer.MIN_VALUE);
		Person p1 = new Person();
		p1.name = "���ں�";
		p1.age = 27;
		p1.nation = "���ѹα�";
			System.out.println
			("p1�� �����ϴ� ��ü�� �̸��� " + p1.name + p1.nation +"�Դϴ�");

	}

}
