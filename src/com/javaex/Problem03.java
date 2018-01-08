package com.javaex;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//주어진 문자열의 공백을 ',' 콤바로 변경후 출력하세요
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(char a : c){	
			if(a==' '){
				a=',';
			}
			System.out.print(a);
		}
		
	}

}
