package com.capgemini.assignments.day6;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class CarCompareTo {

	@Test
	void test() {
//		Comparator<Car> priceComparator = (c1, c2) -> {
//			int result = c1.getMake()compareTo(c2.getMake());
//			if(result == 0)
//				return c2.getModel().compareTo(c1.getModel());
//			return result;
//		};
//		
//		TreeSet<Car> products = new TreeSet<>(priceComparator);
//		
//		 products.add (new Car("Benz", "b1", 18, 80_00_000));
//		 products.add (new Car("Audi", "a1", 15, 70_00_000));
//		 products.add (new Car("Ferrari", "f1", 14, 60_00_000));
//		 products.add (new Car("BMW", "b2", 13, 50_00_000));
//		 products.add (new Car("Acura", "a2", 12, 90_00_000));
//		 
//		 for (Car car : products) {
//			System.out.println(car.make);
//		}		 
//	}	
		Car c1,c2,c3,c4 ;
		Comparator<Car> modelComparator=(car1, car2) -> {
			return car1.getMake().compareTo(car2.getMake()) ;
			};
			
			TreeSet<Car> array = new TreeSet<>(modelComparator);
			c1=new Car("Honda","city1",2000,10000000) ;
			c2=new Car("Chevrolet","model2",2005,200000) ;
			c3=new Car("Honda","Brio",2018,700000) ;
			c4=new Car("Audi", "A4", 2018, 900000);
			array.add(c1) ;
			array.add(c2) ;
			array.add(c3) ;
			array.add(c4);
			Iterator<Car> itr = array.iterator();
			assertEquals(new Car("Audi","A4",2018,900000),itr.next());
			 
			 for (Car car : array) {
				System.out.println(car.make);
			}	
	}
	}


