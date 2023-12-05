package collectiond;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "Ram");
		map.put("city", "Ayodhya");
		map.put("spouse", "Sita");

		System.out.println(map.get("name"));
		System.out.println(map.get("contactNum"));// null
		System.out.println(map.get("Name"));// null
		System.out.println(map.size());
		map.remove("spouse");
		System.out.println(map);
		System.out.println(map.size());
		//map.clear(); // remove all keys from map
		boolean x = map.containsKey("name");
		System.out.println(x);

		x = map.containsValue("sita");
		System.out.println(x);

		System.out.println(map);
		map.put("name", "Laxman");
		System.out.println(map);
		map.put("district", "Ayodhya");
		System.out.println(map);
		
		Set<String> allKeys =  map.keySet();
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(1, "one");
	}
}
