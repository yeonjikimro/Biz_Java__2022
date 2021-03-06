package com.callor.app.exec;

public class Exec3 {
	/*
	 * 정수형 배열 10개 선언하고
	 * 1 ~ 100까지 임의의 정수를 생성하여 배열에 저장
	 * 배열 리스트를 보여주고
	 * 배열에 저장된 정수들의 합을 구하여 console 에 출력
	 * 평균을 구하여 console 에 출력
	 */
	public static void main(String[] args) {
		
		int[] array = new int[10];
		int intSum = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
			
		}
		
		for(int num : array) {
			System.out.println(num);
		}
		
		for(int num : array) {
			
			intSum += num;
		}
		System.out.println("배열의 합 : " + intSum);
		
		/*
		 * 이미 위에서 총점을 계산하였는데
		 * 또 반복문을 수행하면서 평균을 다시 계산하는 것은
		 * 매우 비효율적이다.
		 */
		float fAvg = 0f;
		for(int num : array) {
			fAvg += (float)num / array.length;
		}
		System.out.println("평균 : " + fAvg);
		
		
		// 이미 계산된 총점으로 평균을 계산하자
		fAvg = (float)intSum / array.length;
		System.out.printf("평균 : %2.1f",fAvg);
		
		/*
		 * 총점을 구하는 연산이 없다면
		 * 평균을 구할 때 먼저 총점을 구하고
		 * 계산된 총점으로 나누어 평균을 구하는 것이 좋다.
		 * 
		 * 각 항목의 평균을 구하여 누적덧셈을 하는 것은
		 * 연산 오차를 일으킬 수 있다.
		 */
		
		
	}
}
