package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {
		int[] intNum = new int[100];
		int even = 0;
		
		int i = 0;
		int intArray = 0;
		
		for(i = 0; i < intNum.length; i++) {
		
			intNum[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			
			if(bEven) {
				even = intNum[i];

			}
			
		}
		for(i = 0; i < intNum.length; i++) {
			System.out.println(even + ", \t");
			
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	
		}
	

}
