class X{
	void mx(){
		System.out.println("�������� 3.14 �Դϴ�");  
	}
	void mx2(int r){
		System.out.println("���� �������� " + r + "�Դϴ�");
	}
}
class Y extends X{
	void my(){
		System.out.println("���� Ŭ�����Դϴ�"); 
	}
}
public class FinalTest {
	public static void main(String[] args) {
		Y y1 = new Y();
		y1.mx();
		y1.mx2(5);
		y1.my();
		
	}

}
