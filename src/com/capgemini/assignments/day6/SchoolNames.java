package com.capgemini.assignments.day6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SchoolNames {
	ArrayList<String> school= new ArrayList<String>();
	@Test
	void testSchoolNames() {
		
		school.add("Tejasree");
		school.add("Sandhya");
		school.add("Sushma");
		school.add("Devika");
		school.add("Anusha");
		school.add("Suma");
		school.add("Meghana");
		for (String string : school) {
			System.out.println(string);
	
			
		}
	
	}
	
}
