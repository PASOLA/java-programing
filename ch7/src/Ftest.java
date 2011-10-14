class F1/*extends java.lang.Object*/{
	double d1;
	F1(){
		//super(); Object() 생성자 호출
		System.out.println("클래스 F1의 생성자 수행");
		d1 = 10*10;
	}
}
class F2 extends F1{
	//super(); F1() 생성자 호출
	double d2;
	F2(){
		System.out.println("클래스 F2의 생성자 수행");
		d2 = 10*10*10;
	}
}
class Ftest {
	public static void main(String[] args) {
		F2 f2 = new F2();
		System.out.println(f2.d1);
		System.out.println(f2.d2);

	}

}
