class Sam{
	int a = 10;
}
class Expr{
	void add(int i){
		System.out.println(i++);
	}
}
public class ExprTest {
	public static void main(String[] args) {
		Expr e = new Expr();
		Sam t = new Sam();
		e.add(t);
		System.out.println("e.add(t) 호출후의 t.a =" +t.a);
//		int j = 10;
//		e.add(j);
//		System.out.println("e.add(j) 호출후의 j =" +j);
		
		
	}

}
