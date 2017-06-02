/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 *org.dimigo.exception
 *   l_ MovieTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 6. 2.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Movie[] movies = {
				new Movie("에이리언:커버넌트",15),
				new Movie("가디언즈 오브 갤럭시",12)
		};
		int age = 13;
		for(Movie movie : movies){
			try {
				movie.buyticket(age);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
	}

}
