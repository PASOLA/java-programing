class Test{
	void ma(int i) throws ArithmeticException{
		System.out.println(100/i);
		
	}
	void mb(){
		ma(0);
	}
	void mc(){
		try{
		ma(0);
	}catch(ArithmeticException e){
		System.out.println("mc()메서드처리");
	}
	}
}
public class ThrowsTest {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.mb();
		t1.mc();
		

	}

}
