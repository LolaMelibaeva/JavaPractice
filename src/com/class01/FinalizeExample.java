package com.class01;

class FinalizeExample {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object finalized");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeExample f1=new FinalizeExample();
		FinalizeExample f2=new FinalizeExample();
		f1=null;
		f2=null;
		System.gc();
	//	System.out.println(f1);

	}

}
