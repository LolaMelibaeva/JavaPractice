package com.class01;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		char[]arr=str.toCharArray();
//       
//        
//        for (int i=0; i<str.length(); i++) {
//            for(int j=i+1;j<str.length(); j++ ) {
//            if (arr[i]==arr[j]) {
//            System.out.println(arr[j]);     
//            
//            }
//            
//            
     //   }
           
		String str="ashyrova";
   char[]arrCH=str.toCharArray();
    int count = 0;
    char a='a';
    for(char run:arrCH) {
        if(run==a || run=='e') {
            count++;
        }
        
        
    }
    System.out.println(count);
		}
		
		
	}

