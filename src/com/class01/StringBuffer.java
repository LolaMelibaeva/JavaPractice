package com.class01;

class StringBuffer {
	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Syntax");
			String a="Hello";
			String b="Hello";
			String c="Syntax";
			

			a=a.concat(" Syntax");
			System.out.println(a);
			sb=sb.append(" Technologies");
			System.out.println(sb);
	}

	
	}

}
