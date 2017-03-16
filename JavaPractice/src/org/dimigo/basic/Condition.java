/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;

/**
 * <pre>
 *org.dimigo.basic
 *   l_ Condition
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//  if ~ else문
		// 선거권 연령 : 만 19세
		int age = 17;
		
		// 19세 이상이면 "투표하러 가세요", 미만이면 "선거권이 없네요"
		if(age >= 19){
			System.out.println("투표하러 가세요");
		}
		else{
			System.out.println("선거권이 없네요");
		}
		
		
		// switch문
		// 주사위 랜덤 뽑기(1~6)
		System.out.println(new Random().nextInt(6)+1);                  //0~5
		int num = new Random().nextInt(6)+1;
		
		
		switch ( num % 2 ){
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default:
			System.out.println("넌 누구냐!");
		}
		
		String menu = "짬뽕";
		
		switch(menu){
		case "짜장면":
			   System.out.println("짜장면 선택");
			   break;
		case "짬뽕":
			   System.out.println("짬뽕 선택");
			   break;
			  default:
				  System.out.println("다이어트 중");
		}
		
	}

}
