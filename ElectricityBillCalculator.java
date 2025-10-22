package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units consumed: ");
		int units=sc.nextInt();
		double charges;
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(units>=0 && units<=100) {
			charges=units*1.50;
		}else {
			if(units>=101 && units<=200) {
				charges=units*2.00;
			}else {
				if(units>=201 && units<=300) {
					charges=units*3.00;
				}else {
					charges=units*5.00;
				}
			}
		}
		if(charges>1000 && age>=65) {
			charges*=0.15;			
		}else {
			if(charges>1000) {
				charges*=0.1;
			}
		}
		System.out.println("Total electricity bill is: "+charges);
		sc.close();
	}

}
