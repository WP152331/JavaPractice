/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *   l_ PersonTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 26.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class PersonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");
		System.out.println(p);
		System.out.println(k);
		System.out.println(j);
		System.out.println(c);
		System.out.println();
		
		p.sayhello();
		k.sayhello();
		j.sayhello();
		c.sayhello();
		System.out.println();
		
		p.saybye();
		k.saybye();
		j.saybye();
		c.saybye();
	}

}
