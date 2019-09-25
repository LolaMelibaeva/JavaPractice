package com.class01;

abstract class Car {
	public String str;
	Car(){
		 str=("Car is manufactured in Italy");
	}
	int i=10;
	abstract void run();
	
	public void stop() {
		System.out.println("The car can stop");
	
}
}
class Ferrari extends Car{
	
	@Override
	void run() {
		System.out.println("Ferrari runs very fast");
	}
	


	public static void main(String[] args) {
		Car car=new Ferrari();
		car.run();
		car.stop();
		System.out.println(car.str);
		System.out.println(car.i);
	

	

}
}