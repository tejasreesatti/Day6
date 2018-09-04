package com.capgemini.assignments.day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.Test;

class FruitsNames<Returns> {

	@Test
	void test() {
		String a[] = new String[]{"watermelon","Mango"};
		String b[] = new String[]{"Guava","Apple"};

      List list1 = Arrays.asList(a);
	      List list2 = Arrays.asList(b);

      // printing the list
    
	      Map<String,List<String>> hm = new HashMap<>();
			hm.put("Tejasree",list1);
			hm.put("Prasanna",list2);
			hm.put("Swapni", list1);
			hm.put("Anantha",list2);
			
			Set<Entry<String,List<String>>> st = hm.entrySet();   

			for (Entry<String, List<String>> me:st)
				{
					System.out.print(me.getKey()+":");
				System.out.println(me.getValue());
			}


}

}
