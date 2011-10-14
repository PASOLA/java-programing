
class Manager extends Employee{
	int managerFee;
	public Manager(int i, String n, int j, int k, int l){
		super(i,n,j,k);
		managerFee = l;
	}
	void print(){
		int sal = baseSalary + soodang + managerFee;
		System.out.println("사번: " + empNum);
		System.out.println("이름: " + name);
		System.out.println("급여: " + sal);
	}
	
}
