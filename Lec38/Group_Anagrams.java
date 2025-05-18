package Lec38;

import java.util.*;
import java.util.HashMap;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(group_Anagrams(arr));
	}

	public static List<List<String>> group_Anagrams(String[] str) {
		HashMap<String, List<String>> map = new HashMap<>();
		List<List<String>> ll = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			String key = Key_for_Anagrams(str[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(str[i]);
		}
		for (String key : map.keySet()) {
			ll.add(map.get(key));
		}
		return ll;
	}

	public static String Key_for_Anagrams(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]);
		}
		return sb.toString();
	}
}
