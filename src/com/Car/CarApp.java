
/*
 * Tim pieniazek, Julhasur chowdhury, Anthony reakoff
 * 05.07.2018
 * 
 */
package com.Car;



import java.util.Scanner;



public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count;
		
		System.out.println("Welcome to the Grand Circus Motors admin console!\n");
		
		count = Validator.getInt(scan, "How many cars would you like to enter? ");
		Car[] cars = new Car[count];
		
		String ma;
		String mo;
		int ye;
		double pr;		
		
		for (int i = 0; i < count; i++) {
			ma = Validator.getString(scan, "Enter Car #" + (i+1) + " Make: ");
//			cars[i].setMake(ma);
			
			mo = Validator.getString(scan, "Enter Car #" + (i + 1) + " Model: ");
//			cars[i].setModel(mo);
			
			ye = Validator.getInt(scan, "Enter Car #" + (i + 1) + " Year: ");
//			cars[i].setYear(ye);
			
			pr = Validator.getDouble(scan, "Enter Car #" + (i + 1) + " Price: ");
//			cars[i].setPrice(pr);
			
			cars[i] = new Car(ma, mo, ye, pr);
			
			System.out.println();
						
		}
		
		System.out.println("Current Inventory:");
		for(int j=0;j<cars.length;j++) {
			System.out.println(cars[j]);
		}
		
		
		
		
		
//		String cont = "y";
//		while (cont.equalsIgnoreCase("y")) {
//			
//			cont = Validator.getYesOrNo(scan, "Would you like to continue (y/n)? ");
//		}
		
		System.out.println("\nThank you!\nGoodbye! :)");
		
		scan.close();
	}

}
