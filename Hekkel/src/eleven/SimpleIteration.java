package eleven;

import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
	public static void main(String[] args) {
		List<Pet> pets = Pets.arrayList(12);
		Iterator<Pet> it = pets.iterator();
		while (it.hasNext()) {
			Pet p = it.next();
			System.out.println(p.id() + ":" + p + " ");
		}
		
		// easily way:
		
		for (Pet p : pets) {
			System.out.println(p.id() + ":" + " ");
		}
		
		it = pets.iterator();
		for(int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
			System.out.println(pets);
	}
}
