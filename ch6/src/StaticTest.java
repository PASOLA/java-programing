class Test{
	static int a = 10;
	int b = 20;
	static void m1() {
		System.out.println(a++);
//		System.out.println(b++);
		
	}
	void m2() {
		System.out.println(a++);
		System.out.println(b++);
	}
}
public class StaticTest {
	public static void main(String[] args) {
		Test.m1();
	//	Test.m2();
		Test o1 = new Test();
		Test o2 = new Test();
		o1.m1();
		o1.m2();
		o2.m1();
		o2.m2();
		
	}

}
