/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 *org.dimigo.collection
 *   l_ MelonGenreChart
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 6. 13.
 * </pre>
 * 
 * @author : huand
 * @version : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> list = new ArrayList<Music>();
		List<Music> list2 = new ArrayList<Music>();
		
		list.add(new Music("팔레트","아이유"));
		map.put("발라드",list);
		
		list2.add(new Music("l LUV IT","PSY"));
		list2.add(new Music("맞지?","언니쓰"));
		map.put("댄스",list2);
		
		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMap(map);
		
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		list2.set(1,new Music("SIGNAL","트와이스"));
		printMap(map);
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		list2.remove(0);
		printMap(map);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
	}
	
	public static void printMap(Map<String, List<Music>> map){
		int a = 1;
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			for(Music s : map.get(key)){
				System.out.println(a++ + ". " + s);
			}
			a=1;
		}
		System.out.println();
	}
}
