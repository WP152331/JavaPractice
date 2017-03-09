/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *org.dimigo.basic
 *   l_ PrimitiveDataType
 *
 * 1.개요 : 아이유 프로필 출력하기
 * 2.작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("<<아이유 프로필>>\n");
		System.out.printf("이름 : %s\n","아이유");
		System.out.printf("성별 : %s\n","여자");
		System.out.printf("나이 : %d세\n",25);
		System.out.printf("키 : %.2fcm\n",161.8);
		System.out.printf("몸무게 : %.1fkg\n",44.3);
		System.out.printf("혈액형 : %c형\n",'A');
	}

}
