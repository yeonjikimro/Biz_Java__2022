package com.callor.arrays.exec;

/*
 * 정수형 배열 100개를 선언하고
 * Math.random() 를 사용하여 1 ~ 100까지 임의의 수를
 * 생성하고 각 요소에 저장
 * 배열의 각 요소에 저장된 수 중에서
 * 짝수의 리스트를 한 라인에 5개씩 끊어서 출력하시오
 */
public class ExecV6A {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for(int i = 0; i < intNums.length ; i++) {
			intNums[i] = (int)(Math.random() * 100 ) + 1;
		}
		/*
		 * 짝수를 5번 출력하고 Enter 를 출력하여 줄바꿈하기
		 * i 변수를 사용하여 횟수를 구분하면 홀수일 대, 짝수일 때 상관없이
		 * i 변수값은 변화를 하기 때문에 문제가 발생한다
		 * 
		 * 짝수를 출력할 때마다 출력한 횟수를 저장할 변수가 필요하다
		 * 별도로 짝수를 출력할 때마다 출력한 횟수를 저장할 변수를 
		 * for() 명령문 이전에 선언을 해주어야 한다.
		 */
		int intEvenPrintCount = 0;
		for(int i = 0; i < intNums.length; i++) {
			boolean bEven = intNums[i] % 2 == 0;
			if(bEven) {
				System.out.printf("%d\t",intNums[i]);
				// 짝수를 출련한 후 출력한 횟수를 1 증가시키기지
				intEvenPrintCount ++;
				
				// 짝수를 출력한 횟수가 5가 되면 줄바꿈(println() ) 한다
				if(intEvenPrintCount % 5 == 0 ) {
					System.out.println();
				}
			}
		}
	}

}
