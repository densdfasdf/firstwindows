package eleven;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * testing HashMap
 * 
 * */

public class PetMap {
	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));
		petMap.put("My Hamster", new Humster("Bosco"));
		System.out.println(petMap);
		Pet dog = petMap.get("My Dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("My Dog"));
		System.out.println(petMap.containsValue(dog));
		System.out.println(petMap);
	}
}
