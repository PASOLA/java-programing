
class Secretary extends Employee{
	int secFee;
	public Secretary(int i, String n, int j, int k, int l){
		super(i,n,j,k);
		secFee = l;
	}
	void print(){
		int sal = baseSalary + soodang + secFee;
		System.out.println("사번: " + empNum);
		System.out.println("이름: " + name);
		System.out.println("급여: " + sal);
	}

}
