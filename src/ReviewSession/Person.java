package ReviewSession;

public class Person {
	
	protected String name;
	protected int age;
	protected int weight;
	 public Person () {
		 
	 }

	 public Person (String name, int age) {
		 this.name=name;
		 this.age=age;
	 }

	 public Person (String name, int age, int w) {
		 this.name=name;
		 this.age=age;
		 this.weight=w;
	 }
	 
	 public void sleep() {
		 System.out.println("----sleeping----");
	 }
	 public void displayInfo() {
		 System.out.println("I am a person, name is "+ this.name+" my age is "+this.age+" my weight is "+this.weight);
	 }
}
