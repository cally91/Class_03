package com.biz.Exec;

import java.util.Scanner;

public class Keyinput_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("국가명(영문)입력 >>");
		String keystr =scan.nextLine();
		System.out.println(keystr);
		if (keystr.equalsIgnoreCase("KOREA")){
				System.out.println("대한민국 사람이군요");
		}else if (keystr.equalsIgnoreCase("USA")){
			System.out.println("미국사람 이군요");
		}else {
			System.out.println("잘 모르는 곳이네요");
		}
			
	}

}
