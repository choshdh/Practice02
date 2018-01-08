package com.javaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다섯개의 숫자를 입력받아 평균을 구하시오
		
		int [] num = new int[5];
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평균 구하기");
		
		for(int i=0; i<num.length; i++){
			try {
				System.out.println("숫자를 입력하세요");
				num[i] = sc.nextInt();
				sc.nextLine();
				total += num[i];
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block
				sc.nextLine();
				System.out.println("숫자만 입력해주세요");
				i--;
			}
		}
		
		System.out.println("평균은 : " + total/num.length);
	}

}
