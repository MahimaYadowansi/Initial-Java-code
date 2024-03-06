package initial_code;

import java.util.HashMap;

public class HashmapCollection {

	public static void main(String[] args) {
		HashMap<String, Integer> hashmap= new HashMap<>();
		hashmap.put("mahima", 99);
		hashmap.put("neha", 98);
		hashmap.put("priya", 97);
		hashmap.put("puja", 96);
		System.out.println(hashmap);
		System.out.println(hashmap.get("neha"));
		System.out.println(hashmap.get("juli"));
		System.out.println(hashmap.get("priya"));
		System.out.println(hashmap.containsKey("neha"));
		System.out.println(hashmap.containsValue(96));
		System.out.println(hashmap.containsValue(88));
	}

}
