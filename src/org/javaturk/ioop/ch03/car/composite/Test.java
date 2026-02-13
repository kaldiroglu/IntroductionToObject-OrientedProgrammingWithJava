package org.javaturk.ioop.ch03.car.composite;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Test {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.tckn = "1";
		person1.firstName = "Zeynep";
		person1.lastName = "Kaya";
		
		Car car1 = new Car();
		car1.make = "Mercedes";
		car1.model = "E200";
		car1.year = "2011";
		car1.speed = 80;
		car1.distance = 130_000;
		
		System.out.println(car1.getInfo());
		System.out.println(person1.getInfo());
//		
		System.out.println("*************");
		
		//That's how the relationship/association is established.
		// That's a bi-directional, 1-1 association
		car1.owner = person1; // All is of type Person
		person1.vehicle = car1; // All is of type Car
		
		car1.speed = 100;
		car1.go(10);
	
		System.out.println(car1.getInfo());
		System.out.println(person1.getInfo());

		System.out.println(person1.vehicle.make);
		System.out.println(person1.vehicle.owner.firstName);
//		
		System.out.println("*************");
		
		// A car without an owner
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "i8";
		car2.year = "2019";
		car2.speed = 0;
		car2.distance = 0;
		System.out.println(car2.getInfo());
		
		// A person without a car
		Person person2 = new Person();
		person2.tckn = "2";
		person2.firstName = "Ahmet";
		person2.lastName = "Ozturk";
		System.out.println(person2.getInfo());
		
		// Person Ahmet buys BMW i8
		person2.vehicle = car2;
		car2.owner = person2;

		System.out.println();

		System.out.println(car2.getInfo());
		System.out.println(person2.getInfo());

		System.out.println("\nAfter selling the car");

		person2.vehicle = null;
		car2.owner = null;
		//car1.owner = null;
		
		person1.vehicle = car2;
		car2.owner = person1;
		System.out.println(person2.getInfo());
		System.out.println(person1.getInfo());
		
		System.out.println(car2.getInfo());
		System.out.println(car1.getInfo());
//		System.out.println(ahmet.getInfo());
		
		System.out.println("\nExchange the vehicles");
		person2.vehicle = car1;
		car1.owner = person2;
		person1.vehicle = car2;
		car2.owner = person1;

		System.out.println(car2.getInfo());
		System.out.println(car1.getInfo());
		System.out.println(person1.getInfo());
		System.out.println(person2.getInfo());
		System.out.println();
		
//		person1.vehicle = null;
//		car2.owner = null;
		System.out.println(car2.getInfo());
		System.out.println(person1.getInfo());
		
//		System.out.println(person1.vehicle.owner.firstName);
		person1.vehicle.owner = null;
		System.out.println(person1.vehicle.owner.firstName);
	}
}
