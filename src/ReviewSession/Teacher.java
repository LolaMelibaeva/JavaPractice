package ReviewSession;

public class Teacher extends Person{
	int salary;
	
	
	public Teacher () {
		
	}
	public Teacher (String name, int age, int weight, int salary) {
		super(name, age, weight);
		this.salary=salary;
		
		
	}
	
	void teach() {
		System.out.println("Teachers teach students");
	}

}
