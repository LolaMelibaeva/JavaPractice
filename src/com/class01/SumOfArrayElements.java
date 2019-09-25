package com.class01;

public class SumOfArrayElements {
	
	public static void getSum (int [] arr) {
		int sum=11;
		
		for (int i=0; i<arr.length; i++) {
			for (int j=i; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+", "+arr[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int [] arr= {8,3,4,7,5,6};
		getSum(arr);
		
		for (int i=0; i<=6; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		
		for (int i=0; i<7; i++) {
			for (int j=i; j<7; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			}
		
		System.out.print("Previous : ");
	      System.out.println(System.getProperty("java.runtime.version" ));
	      System.out.println(System.getProperty("user.dir"));
	      
	      System.out.println(System.getProperty("webdriver.chromedriver.driver"));
		}
	}


