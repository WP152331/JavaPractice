/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *   l_ Korean
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 26.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class Korean extends Person {

	public Korean(String name){
		super(name);
	}
	
	public void sayhello(){
		System.out.println("안녕하세요");
	}
	
	public void saybye(){
		System.out.println("안녕히 계세요");
	}
	
	public String toString(){
		return "저는 한국사람 " + getName() + "입니다.";
	}
}
