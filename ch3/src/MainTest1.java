
public class MainTest1 {
	public static void main(String[] args) {
		System.out.println
		("입력 변수의 갯수 = " + args.length); 
		for(int i = 0; i<args.length; i++){
			System.out.println(args[i]);
		}	
		int j1 = Integer.parseInt(args[0]);
		int j2 = Integer.parseInt(args[1]);
		System.out.println(j1+j2);
		
	}

}
