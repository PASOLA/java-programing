class Adding{
	int add(int i, int j){
		return i + j;
	}
	String add (String i , String j){
		return i + j;
	}
	Double add(double i, double j){
		return i + j;
	}
}
public class OverloadTest {
	public static void main(String[] args) {
		Adding a = new Adding();
		double result1 = a.add(3.14 ,2.56);
		int result2 = a.add(10,20);
		String result3 = a.add("java", "program");
		Double result4 = a.add(3.14 , 20);
		
		System.out.println("½Ç¼öµ¡¼À =" +result1);
		System.out.println("Á¤¼öµ¡¼À =" +result2);
		System.out.println("¹®ÀÚ¿­°áÇÕ =" +result3);
		System.out.println("Á¤¼ö,½Ç¼öµ¡¼À =" +result4);
		
		int dec = Integer.parseInt("100");
		int bin = Integer.parseInt("100",2);
		System.out.println("½ÊÁø¼ö º¯È¯ = " + dec);
		System.out.println("ÀÌÁø¼ö º¯È¯ = " + bin);
		
		
	}

}
