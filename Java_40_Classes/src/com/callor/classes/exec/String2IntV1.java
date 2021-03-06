package com.callor.classes.exec;

import com.callor.classes.utls.Line;

public class String2IntV1 {

	public static void main(String[] args) {
		
		String strAge = "";
		int intAge = 33; // 정수형 숫자
		
		// 숫자형 변수 + "문자열" : 숫자값을 문자열형 값으로 형변환
		strAge = intAge + "";
		
		// Integer.toString(정수값) :
		// Integer 클래스에 선언된 toString static method 에게
		// 정수값 arg 로 전달하여 문자열로 return 받는다.
		// Integer.toString() : 정수형 숫자를 문자열형 숫자로 바꾼다
		strAge = Integer.toString(intAge);
		
		System.out.println(strAge);
		// Integer.valueOff() : 문자열형 숫자를 정수형 숫자로 바꾼다
		strAge = "55"; // 문자열형 숫자
		intAge = Integer.valueOf(strAge);
		
		System.out.println(Integer.toBinaryString(33));

		
		
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
		
		int intSum = num1 + num2;		
		String strSum = Integer.toBinaryString(intSum);
		
		System.out.println(Line.dLine(20));
		System.out.printf("	   %s\n", strBinNum1);
		System.out.printf(" +  %s\n", strBinNum2);
		System.out.println(Line.sLine(20));
		System.out.printf("   %s\n", strSum);
		System.out.println(Line.dLine(20));
	
		
		
	}
}
