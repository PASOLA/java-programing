
class Secretary extends Employee{
	int secFee;
	public Secretary(int i, String n, int j, int k, int l){
		super(i,n,j,k);
		secFee = l;
	}
	void print(){
		int sal = baseSalary + soodang + secFee;
		System.out.println("���: " + empNum);
		System.out.println("�̸�: " + name);
		System.out.println("�޿�: " + sal);
	}

}
