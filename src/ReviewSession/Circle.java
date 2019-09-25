package ReviewSession;

public class Circle {
	private double radius;
	private String color;

	Circle() {
		radius = 1.0;
		color = "red";
	}

	Circle(double radius) {
		this.radius = radius;
	}

	Circle(double radius, String color) {
		this(radius);
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("radius must be greater than 0");
		}
	}

	public String getColor() {
		return color;
	}

	
		public void setColor(String color) {
	        if(color.equals("red")||color.equals("blue")||color.equals("green")) {	    
	        this.color = color;
	    }else {
			System.out.println("The color must be only red, blue, or green");
		
	}
		}
	
	public String toString() {
		
		   return "The circle has a radius=" + radius + " and a color=" + color;
		}
	
	
	public double getArea(double radius) {
		
		double area=3.14*(radius*radius);
		return area;
	}
	public static void main(String[] args) {
		Circle obj1=new Circle();
		System.out.println("------------Obj1--------------");
		
		System.out.println(obj1.toString());
		
		System.out.println("The area of the circe is " + obj1.getArea(obj1.getRadius()));
		
		
		System.out.println("------------Obj2--------------");
		Circle obj2=new Circle(2.0);
		obj2.setRadius(2.0);
		obj2.setColor("green");
		System.out.println(obj2.toString()); 
		
		System.out.println("The area of the circe is " + obj2.getArea(obj2.getRadius()));
		
		System.out.println("-----------------Obj3------------");
		
		Circle obj3=new Circle(3.0, "blue");
		
		obj3.setRadius(3.0);
		obj3.setColor("blue");
		System.out.println(obj3.toString());
		
		System.out.println("The area of the circe is " + obj3.getArea(obj3.getRadius()));
		
		System.out.println("------------Obj4--------------");
		Circle obj4=new Circle(0.0, "pink");
		
		obj4.setRadius(0.0);
		obj4.setColor("pink");
		System.out.println(obj4.toString());
		
		System.out.println("The area of the circe is " + obj4.getArea(obj4.getRadius()));
		

	}

	
}