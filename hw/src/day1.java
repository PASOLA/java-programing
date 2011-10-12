
public class day1 {
	public static void main(String[] args) {
		int arr[]= new int[5];
		arr[0] = Integer.parseInt(args[0]);
		arr[1] = Integer.parseInt(args[1]);
		arr[2] = Integer.parseInt(args[2]);
	    
		arr[3] = (arr[0]+arr[1]+arr[2]);
		arr[4] = arr[3]/3;
		System.out.println("배열출력");
		for(int i = 0; i< arr.length; i++){
			System.out.println(arr[i]); 
		}
		
		if(arr[4]>= 90)
			System.out.println("A등급");
		else if(arr[4] >= 80)
			System.out.println("B등급");
		else if(arr[4] >= 70)
			System.out.println("C등급");
		else if(arr[4] >= 60)
			System.out.println("D등급");
		else 
			System.out.println("F등급");
			
			
			
		

	}

}
