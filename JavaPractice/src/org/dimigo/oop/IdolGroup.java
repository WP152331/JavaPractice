/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *   l_ IdolGroup
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 4. 7.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class IdolGroup {

	public void printArr(String[][] arr, String[] arr1){
		for(int i = 0; i < arr.length; i++){
			System.out.println("<<" + arr1[i] + ">>");
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		IdolGroup obj = new IdolGroup();
		String[] groupname = {"빅뱅","2NE1","걸스데이"};
		String[][] membername = {
				{"GD","태양","대성","탑","승리"},
				{"CL","산다라박","박봄","민지"},
				{"유라","혜리","소진","민아"}
		};
		
		obj.printArr(membername, groupname);
	}

}
