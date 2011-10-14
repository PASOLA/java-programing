
class Engineer extends Employee{
	int qFee;
	int tFee;
	public Engineer(int i, String n , int j, int k, int l, int m){
		super(i,n,j,k);
		qFee = 1;
		tFee = m;
	}
	void print() {
		int sal = baseSalary + soodang + qFee+ tFee;
		System.out.println("사번: " + empNum);
		System.out.println("이름: " + name);
		System.out.println("급여: " + sal);
	}
}
