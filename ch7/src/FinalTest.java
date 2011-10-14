class X{
	void mx(){
		System.out.println("원주율은 3.14 입니다");  
	}
	void mx2(int r){
		System.out.println("원의 반지름은 " + r + "입니다");
	}
}
class Y extends X{
	void my(){
		System.out.println("하위 클래스입니다"); 
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
