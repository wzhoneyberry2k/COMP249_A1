//----------------------------------
//Assignment 2
//Part 1
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------
package driverOnePackage;

import java.util.Scanner;

import firstPackage.Airplane;
import fourthPackage.UAV;
import secondPackage.*;
import thirdPackage.Multirotor;
import fifthPackage.*;

public class DriverOne {

	public static void main(String[] args) {

		// create an array of 3 airplanes, 3 UAVs, 3 Helicopters, 2 quadcopters, 3
		// multirotors, 3 MAVs, and 3 agricultural drones
		Airplane[] airplane = new Airplane[3];
		UAV[] uav = new UAV[3];
		MAV[] mav = new MAV[3];
		AgriculturalDrone[] agriculturalDrone = new AgriculturalDrone[3];
		Helicopter[] helicopter = new Helicopter[3];
		Quadcopter[] quadcopter = new Quadcopter[3];
		Multirotor[] multirotor = new Multirotor[3];

		// Assign values to airplanes
		for (int i = 0; i <= 2; i++) {
			airplane[i] = new Airplane();
			airplane[i].setBrand(HBrand());
			airplane[i].setHorsepower(horsePower());
			airplane[i].setPrice(Price());
		}

		// Assign values to UAVs
		for (int i = 0; i <= 2; i++) {
			uav[i] = new UAV();
			uav[i].setPrice(Price());
			uav[i].setWeight(weight());
		}

		// Assign values to helicopters
		for (int i = 0; i <= 2; i++) {
			helicopter[i] = new Helicopter();
			helicopter[i].setNoOfCylinders(Cylinder());
			helicopter[i].setBrand(HBrand());
			helicopter[i].setPrice(Price());
			helicopter[i].setHorsepower(horsePower());
			helicopter[i].setPassengerCapacity(passenger());
			helicopter[i].setCreationYear(year());
		}

		// Assign values to quadcopters
		for (int i = 0; i <= 2; i++) {
			quadcopter[i] = new Quadcopter();
			quadcopter[i].setNoOfCylinders(Cylinder());
			quadcopter[i].setBrand(HBrand());
			quadcopter[i].setPrice(Price());
			quadcopter[i].setMaxFlyingSpeed(maxSpeed());
			quadcopter[i].setPassengerCapacity(passenger());
			quadcopter[i].setCreationYear(year());
			quadcopter[i].setHorsepower(horsePower());
		}

		// Assign values to multirotors
		for (int i = 0; i <= 2; i++) {
			multirotor[i] = new Multirotor();
			multirotor[i].setNoOfCylinders(Cylinder());
			multirotor[i].setBrand(HBrand());
			multirotor[i].setPrice(Price());
			multirotor[i].setHorsepower(horsePower());
			multirotor[i].setPassengerCapacity(passenger());
			multirotor[i].setCreationYear(year());
			multirotor[i].setNoOfRotors(rotors());
		}

		// Assign values to MAVs
		for (int i = 0; i <= 2; i++) {
			mav[i] = new MAV();
			mav[i].setModel(model());
			mav[i].setPrice(dronePrice());
			mav[i].setSize(size());
			mav[i].setWeight(weight());
		}

		// Assign values to agricultural drones
		for (int i = 0; i <= 2; i++) {
			agriculturalDrone[i] = new AgriculturalDrone();
			agriculturalDrone[i].setBrand(AGDBrand());
			agriculturalDrone[i].setCarryCapacity(capacity());
			agriculturalDrone[i].setPrice(dronePrice());
			agriculturalDrone[i].setWeight(weight());
		}

		// Assign same values to two agricultural drones
		for (int i = 1; i <= 2; i++) {
			agriculturalDrone[i].setBrand("Norbert");
			agriculturalDrone[i].setCarryCapacity(4);
			agriculturalDrone[i].setPrice(2000);
			agriculturalDrone[i].setWeight(42);
		}

		// display welcome message
		System.out.println("--------------------------------------------------------------");
		System.out.println("                           WELCOME                            ");
		System.out.println("--------------------------------------------------------------\n");
		enterToContinue();
		System.out.println("Loading information for the flying objects.........................\n");

		// display the information for the flying objects
		for (int i = 0; i <= 2; i++) {
			System.out.println(airplane[i] + "\n");
		}
		enterToContinue();
		for (int i = 0; i <= 2; i++) {
			System.out.println(uav[i] + "\n");
		}
		enterToContinue();
		for (int i = 0; i <= 2; i++) {
			System.out.println(helicopter[i] + "\n");
		}
		enterToContinue();
		for (int i = 0; i <= 2; i++) {
			System.out.println(quadcopter[i] + "\n");
		}
		enterToContinue();
		for (int i = 0; i <= 2; i++) {
			System.out.println(multirotor[i] + "\n");
		}
		enterToContinue();

		for (int i = 0; i <= 2; i++) {
			System.out.println(mav[i] + "\n");
		}
		enterToContinue();
		for (int i = 0; i <= 2; i++) {
			System.out.println(agriculturalDrone[i] + "\n");
		}
		enterToContinue();

		// compare equality of flying objects
		System.out.println("Compare equality of objects in different classes..............\n");
		String string;
		if (quadcopter[0].getBrand() == multirotor[0].getBrand()
				&& quadcopter[0].getHorsepower() == multirotor[0].getHorsepower()
				&& quadcopter[0].getPrice() == multirotor[0].getPrice()
				&& quadcopter[0].getCreationYear() == multirotor[0].getCreationYear()
				&& quadcopter[0].getPassengerCapacity() == multirotor[0].getPassengerCapacity()
				&& quadcopter[0].getNoOfCylinders() == multirotor[0].getNoOfCylinders()) {
			string = "identical";
		} else
			string = "different";
		System.out.println("The first quadcopter and first multirotor are " + string + "\n");
		enterToContinue();
		System.out.println("Comparing equality of objects in same class..............\n");
		if (agriculturalDrone[0].equals(agriculturalDrone[1])) {
			string = "identical";
		} else
			string = "different";
		System.out.println("The first Agricultural drone and the second Agricultural drone are " + string + "\n");

		System.out.println("Comparing equality of objects with similar values in the same class..............\n");
		if (agriculturalDrone[1].equals(agriculturalDrone[2])) {
			string = "identical";
		} else
			string = "different";
		System.out.println("The second Agricultural drone and the third Agricultural drone are " + string + "\n");

		// invoke the comparing method
		enterToContinue();
		System.out.println("Finding the least and most expensive UAV........................\n");
		findLeastAndMostExpensiveUAV(uav);
	}

	// static method that accepts any array of flying objects as a parameter
	public static void findLeastAndMostExpensiveUAV(UAV[] uav) {
		double[] Num = new double[3];
		int maxOrder = 0;
		int minOrder = 0;
		for (int i = 0; i <= 2; i++) {
			Num[i] = uav[i].price;
			double maxValue = Num[0];
		}
		if (uav.length > 1) {
			if (uav[0].price == uav[1].price && uav[0].price == uav[2].price && uav[1].price == uav[2].price) {
				System.out.println("The price of UAVs are the same!");
			} else {

				double maxValue = Num[0];
				for (int i = 1; i < Num.length; i++) {
					if (Num[i] > maxValue) {
						maxValue = Num[i];
						maxOrder = i;
					}
				}
				double minValue = Num[0];
				for (int i = 1; i < Num.length; i++) {
					if (Num[i] < minValue) {
						minValue = Num[i];
						minOrder = i;
					}
				}
				System.out.println(
						"UAV " + (maxOrder + 1) + " has the highest price. " + uav[maxOrder].toString() + "\n");
				System.out
						.println("UAV " + (minOrder + 1) + " has the lowest price. " + uav[minOrder].toString() + "\n");
			}

		} else if (uav.length == 0) {
			System.out.println("No objects found within the input array!");

		} else if (uav.length == 1) {
			System.out.println("One object is in the array. " + uav[0].toString());
		}
	}

	// generate number of cylinders
	public static int Cylinder() {
		int Num;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 4 || Num > 28);
		return Num;
	}

	// generate brand
	public static String HBrand() {
		int Num;
		String string = null;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 6);

		switch (Num) {
		case 1:
			string = "Chopper";
			break;
		case 2:
			string = "Hellcat";
			break;
		case 3:
			string = "Karorel";
			break;
		case 4:
			string = "Aviato";
			break;
		case 5:
			string = "Juniper";
			break;
		case 6:
			string = "Avogato";
			break;
		}
		return string;
	}

	// generate price
	public static double Price() {
		double price = 12100;
		int Num;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			price = 15000;
			break;
		case 2:
			price = 19059;
			break;
		case 3:
			price = 23854;
			break;
		}
		return price;
	}

	// generate horse power
	public static int horsePower() {
		int Num = 0;
		int horsePower = 110;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			horsePower = 140;
			break;
		case 2:
			horsePower = 331;
			break;
		case 3:
			horsePower = 653;
			break;
		}
		return horsePower;
	}

	// generate passengers
	public static int passenger() {
		int Num;
		do {
			Num = (int) (Math.random() * 100);
		} while (Num < 10 || Num > 16);

		return Num;
	}

	// generate year
	public static int year() {
		int Num;
		do {
			Num = (int) (Math.random() * 10000);
		} while (Num < 1985 || Num > 2022);

		return Num;
	}

	// generate max speed
	public static int maxSpeed() {
		int Num;
		do {
			Num = (int) (Math.random() * 1000);
		} while (Num < 250 || Num > 400);

		return Num;
	}

	// generate rotors
	public static int rotors() {
		int Num;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 3 || Num > 8);

		return Num;
	}

	// generate the model
	public static String model() {
		int Num;
		String string = " ";
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			string = "Economy";
			break;
		case 2:
			string = "Comfort";
			break;
		case 3:
			string = "Premium";
			break;
		}
		return string;

	}

	// generate the drone price
	public static double dronePrice() {
		int Num;
		double Price = 113.49;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			Price = 467.51;
			break;
		case 2:
			Price = 647.51;
			break;
		case 3:
			Price = 902.36;
			break;
		}
		return Price;
	}

	// generate the size of drone
	public static double size() {
		double size = 40.29;
		int Num;
		String string = " ";
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			size = 135.67;
			break;
		case 2:
			size = 122.54;
			break;
		case 3:
			size = 312.48;
			break;
		}
		return size;
	}

	// generate weight of drone
	public static double weight() {
		double weight = 1.8;
		int Num;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			weight = 1.6;
			break;
		case 2:
			weight = 2.5;
			break;
		case 3:
			weight = 3.5;
			break;
		}
		return weight;
	}

	// generate the weight of drone
	public static String AGDBrand() {
		int Num;
		String string = "";
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 2 || Num > 3);
		switch (Num) {
		case 1:
			string = "Norbert";
			break;
		case 2:
			string = "Tuson";
			break;
		case 3:
			string = "Diamond";
			break;
		}
		return string;
	}

	public static int capacity() {
		int Num;
		do {
			Num = (int) (Math.random() * 100);
		} while (Num < 30 || Num > 80);
		return Num;
	}

	public static void enterToContinue() {
		System.out.println("Press ANY key to continue...................................");
		Scanner s = new Scanner(System.in);
		s.nextLine();

	}
}