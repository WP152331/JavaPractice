/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 *org.dimigo.Interfaces
 *   l_ DBTest
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class DBTest {
	
	public static void main(String[] args) {
		
		IDBManager a = IDBManager.getDBObject("SYBASE");
		crud(a);
		IDBManager b = IDBManager.getDBObject("ORACLE");
		crud(b);
	}
	private static void crud(IDBManager db){
		if(db instanceof SybaseDB)System.out.println("<변경 전>");
		else if(db instanceof OracleDB)System.out.println("<변경 후>");
		db.insert();
		db.search();
		db.update();
		db.delete();
		System.out.println();
	}
}
