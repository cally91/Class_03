package com.biz.Exec;

import java.util.Scanner;

public class Keyiupull_01 {

	/*
	 * 변수(메모리)에 값들을저장하고
	 * 연산을 수행하고 console에 보여주는 코드
	 * 
	 * 사용자(Operator)가 키보드를 통해서 어떤값을
	 * 직접 입력하고
	 * 그 입력 한 값을 연산 수행하는 경우에
	 * 사용하는 클래스를 학습
	 */
	public static void main(String[] args) {

		
		System.out.println("콘솔에 무엇인가 보여주고자 할때");
		
		//System.out과 반대되는 개념으로
		//키보드로 부터 무언사(data)받아서
		//사용하기 위한준비
		Scanner scanner = new Scanner(System.in);
		// nextLine()은 키보드에 무엇(String)인가 입력되어
		// 마냥 기다리는 상황이 되고
		// 이런 상황을 bidcking가 되었다고한다
		 scanner.nextLine();
		 String keystr = scanner.nextLine();
		 System.out.println("==============");
		 System.out.println(keystr);
		
		
	}

}
