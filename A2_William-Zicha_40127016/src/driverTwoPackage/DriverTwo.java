package driverTwoPackage;

//----------------------------------
//Assignment 2
//Part 2
//Written by: William Zicha 40127016
//Due date: March 5 2022
//----------------------------------

import java.util.Scanner;
import firstPackage.Airplane;
import fourthPackage.UAV;
import secondPackage.*;
import thirdPackage.Multirotor;
import fifthPackage.*;

public class DriverTwo {

	public static void main(String[] args) {
		System.out.println("Welcome to the copying program!");
		enterToContinue();

		// Create an array of 21 objects from each class.
		// Create an array of 3 airplanes, 3 UAVs, 3 helicopters, 2 quadcopters, 3
		// multirotors, 3 MAVs and 3 agricultural drones
		Airplane[] airplane = new Airplane[3];
		UAV[] uav = new UAV[3];
		MAV[] mav = new MAV[3];
		AgriculturalDrone[] agriculturalDrone = new AgriculturalDrone[3];
		Helicopter[] helicopter = new Helicopter[3];
		Quadcopter[] quadcopter = new Quadcopter[3];
		Multirotor[] multirotor = new Multirotor[3];
		// input array of multirotors into copyFlyingObjects method
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
			agriculturalDrone[i].setPrice(2215);
			agriculturalDrone[i].setWeight(42);
		}
		System.out.println("Invoking copyFlyingObjects method: \n");
		copyFlyingObjects(helicopter);
		for (int i = 0; i < helicopter.length; i++) {
			System.out.println(helicopter[i].toString());
		}
	}

	// copy and return array of input objects
	public static Object copyFlyingObjects(Object[] object) {
		// 1 quadcopter, 1 multirotor, 1 MAV, and 1 agricultural drone
		Airplane[] airplane = new Airplane[1];
		UAV[] uav = new UAV[1];
		MAV[] mav = new MAV[1];
		AgriculturalDrone[] agriculturalDrone = new AgriculturalDrone[1];
		Helicopter[] helicopter = new Helicopter[1];
		Quadcopter[] quadcopter = new Quadcopter[1];
		Multirotor[] multirotor = new Multirotor[1];

		if (object.getClass() == mav.getClass()) {
			MAV[] mavCopy = new MAV[object.length];
			for (int i = 0; i < object.length; i++) {
				mavCopy[i] = new MAV();
				mavCopy[i].setModel(((MAV) object[i]).getModel());
				mavCopy[i].setPrice(((MAV) object[i]).getPrice());
				mavCopy[i].setSize(((MAV) object[i]).getSize());
				mavCopy[i].setWeight(((MAV) object[i]).getWeight());
			}
			return mavCopy;
		} else if (object.getClass() == uav.getClass()) {
			UAV[] uavCopy = new UAV[object.length];
			for (int i = 0; i < object.length; i++) {
				uavCopy[i] = new UAV();
				uavCopy[i].setPrice(((UAV) object[i]).getPrice());
				uavCopy[i].setWeight(((UAV) object[i]).getWeight());
			}
			return uavCopy;
		} else if (object.getClass() == airplane.getClass()) {
			Airplane[] airplaneCopy = new Airplane[object.length];
			for (int i = 0; i < object.length; i++) {
				airplaneCopy[i] = new Airplane();
				airplaneCopy[i].setHorsepower(((Airplane) object[i]).getHorsepower());
				airplaneCopy[i].setPrice(((Airplane) object[i]).getPrice());
				airplaneCopy[i].setBrand(((Airplane) object[i]).getBrand());
			}
			return airplaneCopy;
		} else if (object.getClass() == agriculturalDrone.getClass()) {
			AgriculturalDrone[] agriculturalDroneCopy = new AgriculturalDrone[object.length];
			for (int i = 0; i < object.length; i++) {
				agriculturalDroneCopy[i] = new AgriculturalDrone();
				agriculturalDroneCopy[i].setBrand(((AgriculturalDrone) object[i]).getBrand());
				agriculturalDroneCopy[i].setCarryCapacity(((AgriculturalDrone) object[i]).getCarryCapacity());
				agriculturalDroneCopy[i].setPrice(((AgriculturalDrone) object[i]).getPrice());
				agriculturalDroneCopy[i].setWeight(((AgriculturalDrone) object[i]).getWeight());
			}
			return agriculturalDroneCopy;
		} else if (object.getClass() == helicopter.getClass()) {
			Helicopter[] helicopterCopy = new Helicopter[object.length];
			for (int i = 0; i < object.length; i++) {
				helicopterCopy[i] = new Helicopter();
				helicopterCopy[i].setBrand(((Helicopter) object[i]).getBrand());
				helicopterCopy[i].setCreationYear(((Helicopter) object[i]).getCreationYear());
				helicopterCopy[i].setPrice(((Helicopter) object[i]).getPrice());
				helicopterCopy[i].setNoOfCylinders(((Helicopter) object[i]).getNoOfCylinders());
				helicopterCopy[i].setPassengerCapacity(((Helicopter) object[i]).getPassengerCapacity());
				helicopterCopy[i].setHorsepower(((Helicopter) object[i]).getHorsepower());
			}
			return helicopterCopy;
		} else if (object.getClass() == quadcopter.getClass()) {
			Quadcopter[] quadcopterCopy = new Quadcopter[object.length];
			for (int i = 0; i < object.length; i++) {
				quadcopterCopy[i] = new Quadcopter();
				quadcopterCopy[i].setBrand(((Quadcopter) object[i]).getBrand());
				quadcopterCopy[i].setCreationYear(((Quadcopter) object[i]).getCreationYear());
				quadcopterCopy[i].setPrice(((Quadcopter) object[i]).getPrice());
				quadcopterCopy[i].setNoOfCylinders(((Quadcopter) object[i]).getNoOfCylinders());
				quadcopterCopy[i].setPassengerCapacity(((Quadcopter) object[i]).getPassengerCapacity());
				quadcopterCopy[i].setHorsepower(((Quadcopter) object[i]).getHorsepower());
				quadcopterCopy[i].setMaxFlyingSpeed(((Quadcopter) object[i]).getMaxFlyingSpeed());
			}
			return quadcopterCopy;

		} else if (object.getClass() == multirotor.getClass()) {
			Multirotor[] multirotorCopy = new Multirotor[object.length];
			for (int i = 0; i < object.length; i++) {
				multirotorCopy[i] = new Multirotor();
				multirotorCopy[i].setBrand(((Multirotor) object[i]).getBrand());
				multirotorCopy[i].setCreationYear(((Multirotor) object[i]).getCreationYear());
				multirotorCopy[i].setPrice(((Multirotor) object[i]).getPrice());
				multirotorCopy[i].setNoOfCylinders(((Multirotor) object[i]).getNoOfCylinders());
				multirotorCopy[i].setPassengerCapacity(((Multirotor) object[i]).getPassengerCapacity());
				multirotorCopy[i].setHorsepower(((Multirotor) object[i]).getHorsepower());
				multirotorCopy[i].setNoOfRotors((((Multirotor) object[i]).getNoOfRotors()));
			}
			return multirotorCopy;

		} else
			return null;

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
		double price = 52500;
		int Num;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			price = 22400;
			break;
		case 2:
			price = 22200;
			break;
		case 3:
			price = 42640;
			break;
		}
		return price;
	}

	// generate horsepower
	public static int horsePower() {
		int Num = 0;
		int horsePower = 10;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			horsePower = 21;
			break;
		case 2:
			horsePower = 31;
			break;
		case 3:
			horsePower = 43;
			break;
		}
		return horsePower;
	}

	// generate number of passengers
	public static int passenger() {
		int Num;
		do {
			Num = (int) (Math.random() * 100);
		} while (Num < 10 || Num > 16);

		return Num;
	}

	// generate the year
	public static int year() {
		int Num;
		do {
			Num = (int) (Math.random() * 10000);
		} while (Num < 1942 || Num > 2022);

		return Num;
	}

	// generate the max speed
	public static int maxSpeed() {
		int Num;
		do {
			Num = (int) (Math.random() * 1000);
		} while (Num < 250 || Num > 400);

		return Num;
	}

	// generate the rotors
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

	// generate drone price
	public static double dronePrice() {
		int Num;
		double Price = 204.30;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			Price = 653.51;
			break;
		case 2:
			Price = 857.31;
			break;
		case 3:
			Price = 1943.56;
			break;
		}
		return Price;
	}

	// generate drone size
	public static double size() {
		double size = 402.29;
		int Num;
		String string = " ";
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			size = 153.11;
			break;
		case 2:
			size = 176.32;
			break;
		case 3:
			size = 284.35;
			break;
		}
		return size;
	}

	// generate weight of drone
	public static double weight() {
		double weight = 0.8;
		int Num;
		do {
			Num = (int) (Math.random() * 10);
		} while (Num < 1 || Num > 3);

		switch (Num) {
		case 1:
			weight = 2.4;
			break;
		case 2:
			weight = 3.5;
			break;
		case 3:
			weight = 4.5;
			break;
		}
		return weight;
	}

	// display agricultural drone brand
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

	// generate capacity of agricultural drone
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
		s.close();
	}

}