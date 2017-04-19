/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *   l_ PiggyBankTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 19.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		
		FamilyMember f1 = new FamilyMember("아빠");
		FamilyMember f2 = new FamilyMember("엄-마");
		FamilyMember f3 = new FamilyMember("나");
		FamilyMember f4 = new FamilyMember("남동생");
		
		FamilyMember.printMemberCnt();
		
		PiggyBank.putMoney(f1, 10000);
		PiggyBank.putMoney(f2, 5000);
		PiggyBank.putMoney(f3, 2000);
		PiggyBank.putMoney(f4, 1000);
		
		PiggyBank.printBalance();

		PiggyBank.putMoney(f3, 1000);
	
		PiggyBank.printBalance();
		
	}

}
