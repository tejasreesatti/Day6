package com.capgemini.assignments.day6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

class collectionInstances {

	@Test
	void testLaptop() {
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		assertEquals(true, laptop.add(new Laptop("Dell", "Inspiron15", "Windows", "I7")));
		assertEquals(true, laptop.add(new Laptop("HP", "Inspiron15", "Linux", "Pentium5")));
		assertEquals(true, laptop.add(new Laptop("Acer", "Inspiron15", "Windows", "I5")));

		
		for (Laptop lap : laptop) {
		System.out.println(lap.getCompany() +  " " + lap.getModel() + " "+ lap.getOperatingSystem()+ " "+ lap.getProcessor());	
		}
		System.out.println("\n");
	}
		@Test
		void testCar() {
			ArrayList<Car> car = new ArrayList<Car>();
			assertEquals(true, car.add(new Car("Benz", "Inspiron15", 2018, 20_00_000)));		
			assertEquals(true, car.add(new Car("Ambassador", "Inspiron15", 2018, 10_00_000)));		
			assertEquals(true, car.add(new Car("ferrari", "Inspiron15", 2018, 50_00_000)));	
			for (Car cr : car) {
			System.out.println(cr.getMake() + " " + cr.getModel() + " "+ cr.getYear() + " " + cr.getYear());	
			
			}
			System.out.println("\n");
		}
		
		@Test
		void testTelevision() {
			ArrayList<Television> Tv = new ArrayList<Television>();
			assertEquals(true, Tv.add(new Television("Samsung", "LCD", true, 60_000)));
			assertEquals(true, Tv.add(new Television("BPL", "LCD", true, 50_000)));
			assertEquals(true, Tv.add(new Television("Onida", "LCD", false, 80_000)));
			for (Television tv : Tv) {
				System.out.println(tv.getCompany() + " "+ tv.getType() + " " + tv.getPrice());
			}
			System.out.println("\n");
	}
		@Test
		void testCellphone() {
			ArrayList<CellPhone> cell = new ArrayList<CellPhone>();
			assertEquals(true, cell.add(new CellPhone("Lenovo", "K6Power", "20000mah","Android" , 20_000)));
			assertEquals(true, cell.add(new CellPhone("Mi", "note4", "20000mah","Android" , 20_000)));
			assertEquals(true, cell.add(new CellPhone("apple", "8s", "20000mah","mac" , 80_000)));
			for (CellPhone c : cell) {
				System.out.println(c.getCompany() + " "+ c.getDescription() + " " + c.getModel() +" "+ c.getOperatingSystem() + " "+ c.getPrice());
			}
			
			System.out.println("\n");

		}
		
		@Test
		void testSchool() {
			ArrayList<School> sch = new ArrayList<School>();
			assertEquals(true, sch.add(new School("vizag", "K6Power", "20000mah","Android" , 2)));
			assertEquals(true, sch.add(new School("goa", "K6Power", "20000mah","Android" , 2)));
			assertEquals(true, sch.add(new School("mumbai", "K6Power", "20000mah","Android" , 2)));
			for (School s : sch) {
				System.out.println(s.getName() + " "+ s.getCity() + " " + s.getSchool() +" "+ s.getDistrict() + " "+ s.getGreatSchoolRanking());
			
			}
		}
		
}
		

