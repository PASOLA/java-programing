class F1/*extends java.lang.Object*/{
	double d1;
	F1(){
		//super(); Object() ������ ȣ��
		System.out.println("Ŭ���� F1�� ������ ����");
		d1 = 10*10;
	}
}
class F2 extends F1{
	//super(); F1() ������ ȣ��
	double d2;
	F2(){
		System.out.println("Ŭ���� F2�� ������ ����");
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
