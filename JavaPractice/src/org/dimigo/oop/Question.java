/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *org.dimigo.oop
 *   l_ Question
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class Question {
	static Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
		String[] answers = {"트와이스","박보영","응용프로그래밍"};
		
		
		System.out.println("1." + questions[0]);
		String answer = scanner.nextLine();
		if(answer.equals(answers[0])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		
		System.out.println("2." + questions[1]);
		String answer1 = scanner.nextLine();
		if(answer1.equals(answers[1])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		System.out.println("3." + questions[2]);
		String answer3 = scanner.nextLine();
		if(answer3.equals(answers[2])){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("틀렸습니다!");
		}
		
		
		System.out.println("<<결과출력>>");
		StringBuilder sb = new StringBuilder(questions[0]);
		sb.append(" ").append(answers[0]).append("입니다.");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder(questions[1]);
		sb1.append(" ").append(answers[1]).append("입니다.");
		
		StringBuilder sb2 = new StringBuilder(questions[2]);
		sb2.append(" ").append(answers[2]).append("입니다.");

		

	}

}
