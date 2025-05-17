package Lec37;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 77);
		map.put("Vivek", 57);
		map.put("Ankit", 87);
		map.put("Kaju", 77);
		map.put("Ankita", 67);
		map.put("Pooja", 53);
		map.put("Kunal", 55);
		map.put("Ankita", 55);
		// map.put(null, 55);
	//	System.out.println(map);
//		// ContainsKey
//		System.out.println(map.containsKey("Amisha"));
//		System.out.println(map.containsKey("Ankit"));
//		// get
//		System.out.println(map.get("Amisha"));
//		System.out.println(map.get("Ankit"));
//		// remove
//		System.out.println(map.remove("Ankit"));
//		System.out.println(map.remove("Amisha"));
//		System.out.println(map);
		// TODO Auto-generated method stub
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 77);
		map1.put("Vivek", 57);
		map1.put("Ankit", 87);
		map1.put("Kaju", 77);
		map1.put("Ankita", 67);
		map1.put("Pooja", 53);
		map1.put("Kunal", 55);
		map1.put("Ankita", 55);
		// map1.put(null, 55);
	//	System.out.println(map1);
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 77);
		map2.put("Vivek", 57);
		map2.put("Ankit", 87);
		map2.put("Kaju", 77);
		map2.put("Ankita", 67);
		map2.put("Pooja", 53);
		map2.put("Kunal", 55);
		map2.put("Ankita", 55);
		// map2.put(null, 55);
		//System.out.println(map2);
//		Set<String> set = map.keySet();
//		for(String key:set) {
//			System.out.println(key+" "+map.get(key));
//		}
		
		for(String key: map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}

}






















