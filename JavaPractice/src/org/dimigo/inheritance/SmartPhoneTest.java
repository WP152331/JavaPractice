/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 *org.dimigo.inheritance
 *   l_ SmartPhoneTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 5. 12.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class SmartPhoneTest {
	
	public static void main(String[] args) {

		SmartPhone[] s = {
				new IPhone("iPhone7","애플",900000),
				new Galaxy("갤럭시 s8","삼성",800000)
		};
		
		for(SmartPhone s1 : s){
			System.out.println(s1);
			s1.turnOn();
			s1.pay();
			if(s1 == s[0]){
				SmartPhone f1 = new IPhone();
			    f1.useSpecialFunction(f1);
			}
			else if(s1 == s[1]){
				SmartPhone f2 = new Galaxy();
			    f2.useSpecialFunction(f2);
			}
			s1.turnOff();
			System.out.println();
		}
	}

}
