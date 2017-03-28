/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 *org.dimigo.basic
 *   l_ Car2
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 3. 28.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class Car2 {

	/**
	 * @param args
	 */public Car2() {
	    }

	    private String company;
	    private String model;
	    private String color;
	    private int maxSpeed;
	    private int price;
		/**
		 * @param company
		 * @param model
		 * @param color
		 * @param maxSpeed
		 * @param price
		 */
		public Car2(String company, String model, String color, int maxSpeed, int price) {
			super();
			this.company = company;
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			this.price = price;
		}
		/**
		 * @return the company
		 */
		public String getCompany() {
			return company;
		}
		/**
		 * @return the model
		 */
		public String getModel() {
			return model;
		}
		/**
		 * @return the color
		 */
		public String getColor() {
			return color;
		}
		/**
		 * @return the maxSpeed
		 */
		public int getMaxSpeed() {
			return maxSpeed;
		}
		/**
		 * @return the price
		 */
		public int getPrice() {
			return price;
		}
	    
	    

}
