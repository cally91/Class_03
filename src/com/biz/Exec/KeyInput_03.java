package com.biz.Exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ScoreVO sVO=new ScoreVO();
		
		System.out.print("학번 >>");
		String strNumder= scan.nextLine();
		
		System.out.print("국어 점수 >>");
		String strkor =scan.nextLine();
		
		System.out.print("영어 점수 >>");
		String streng =scan.nextLine();
	
		System.out.print("수학 점수 >>");
		String strmath =scan.nextLine();
		sVO.setNumder(strNumder);
		sVO.setKor(Integer.valueOf(strkor));
		sVO.setEng(Integer.valueOf(streng));
		sVO.setMath(Integer.valueOf(strmath));
		
		System.out.println("=================");
		System.out.println("입력내용 확인 ");
		System.out.println("=================");
		System.out.println(sVO.toString());
	
	}

}
