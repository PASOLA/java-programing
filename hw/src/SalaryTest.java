
class SalaryTest {
	public static void main(String args[]){
		Employee e [] = new Employee[4];
		e[0] = new Employee(1000,"�̻��",10000,5000);
		e[1] = new Manager(2000,"�谣��",20000,10000,10000);
		e[2] = new Engineer(3000,"�ڱ��",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"�ֺ�",15000,7000,10000);
	
		for(int i = 0; i<4; i++){
			e[i].print();
		}
	}
}
