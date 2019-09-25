package com.class01;
interface Printable {
	
	
	int i=5;
	void print();
	
}
	class Photo implements Printable{

		@Override
		public void print() {
			System.out.println("Printing Document");
			
		}
		
		
		public static void main (String []rgs) {
			
			Printable b=new Photo();
			b.print();
			System.out.println(Printable.i);
			
		}
		
	}


