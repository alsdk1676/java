package inheritanceTask;

class Employee extends Person{
	// Employee 클래스
	// 비상금
	// work 하루 종일 일을 한다.
	// sleep 잠을 설친다.
	// eat 야식을 먹는다.
	
	String emergencyMoney;
	
	public Employee() {;}
	public Employee(String name, int age, String address, String phone,String emergencyMoney) {
		super(name, age, address, phone);
		this.emergencyMoney = emergencyMoney;
	}
	
	void emergency() {
		System.out.println("비상금을 가지고 있다.");
	}
	
	@Override
	void work() {
//		super.work();
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	void sleep() {
//		super.sleep();
		System.out.println("잠을 설친다.");
	}
	
	@Override
	void eat() {
//		super.eat();
		System.out.println("야식을 먹는다.");
	}
	

}
