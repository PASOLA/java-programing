class Parent{
	int su = 10;
	void pr() {
		System.out.println(su);
	}
	void mp(){
		System.out.println("Parent 클래스");
	}
}
class Child extends Parent{
	int su = 20;
	void pr(){
		System.out.println(su);
	}
	void mc(){
		System.out.println("Child 클래스");
		
	}
}
public class CastingTest {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.pr();
		System.out.println(p1.su);
		p1.mp();
//		p1.mc();
		Parent p2 = new Child();
		p2.pr();
		System.out.println(p2.su);
		p2.mp();
//		p2.mc();
		Child c2 = (Child)p2;
		((Child)p2).mc();
		c2.mc();
		System.out.println(c2.su);
		System.out.println(((Child)p2).su);
		
		
	}

}
