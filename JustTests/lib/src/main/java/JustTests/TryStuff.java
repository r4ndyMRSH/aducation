package JustTests;

import java.time.LocalTime;
import java.util.*;

public class TryStuff {

	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList();
		alist.add("Shit");
		alist.add("Another shit");
		alist.add("One more shit");
		ListIterator iter = alist.listIterator();
		
		
		while (iter.hasNext()) {
			System.out.println("Iteration " + iter.next());
		}
		

	}

}
