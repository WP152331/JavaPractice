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
public class Chinese extends Person {

	public Chinese(String name){
		super(name);
	}
	
	public void sayhello(){
		System.out.println("니하오");
	}
	
	public void saybye(){
		System.out.println("짜이찌엔");
	}
	
	public String toString(){
		return "저는 중국사람 " + getName() + "입니다.";
	}
}
