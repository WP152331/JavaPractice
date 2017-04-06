/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *   l_ Snack
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 5.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class Snack {

	public Snack(String name,String company,int price,int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	
	private String name;
	private String company;
	private int price;
	private int number;
	
	public int calcprice(){
		return price*number;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	 public String toString(){
		 return String.format("이름 : %s\n제조사 : %s\n가격 : %,d원\n개수 : %d개",name,company,price,number);
	 }
}
