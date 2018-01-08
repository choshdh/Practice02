package com.javaex;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//로또 만들기
		
		//배열을 이용한 1~45까지 숫자 6개를 뽑기
		
		int [] lotto = new int [6];
		
		int count = 0;
		
		first : while(count<6){
				
			int lottonum = (int) (Math.random()*45+1);
			
			if(count==0){
				lotto[0]=lottonum;
				System.out.println(lotto[0]);
				count++;
			}else{
				for(int i = 0; i<count; i++){
					if(lotto[i]==lottonum){
						System.out.println(lottonum + "중복 되었습니다.");
						continue first;
					}
				}
				lotto[count]=lottonum;
				System.out.println(lotto[count]);
				count++;
			}
		}
		
		
			
	}

}
