package com.codegnan.controlstatements;

import java.util.Scanner;

public class CartPriceCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Total amount: ");
		double totalbill=sc.nextDouble();
		double discount;
		double festivaldiscount;
		double membershipdiscount;
		System.out.println("Is this festival season(yes/no)");
		boolean festivalSeason=sc.next().equalsIgnoreCase("yes");
		System.out.println("Do have premium membership(yes/no)");
		boolean membership=sc.next().equalsIgnoreCase("yes");
		if(totalbill>=10000) {
			discount=totalbill*0.2;
			totalbill-=discount;
			System.out.println("Discount Applied: "+discount);
		}else {
			if(totalbill>=5000) {
				discount=totalbill*0.1;
				totalbill-=discount;
				System.out.println("Discount Applied: "+discount);
			}else {
				System.out.println("No discount");
			}
		}
		if(festivalSeason) {
			festivaldiscount=totalbill*0.05;
			totalbill-=festivaldiscount;
			System.out.println("Festival Discount Applied: "+festivaldiscount);
		}
		if(membership) {
			membershipdiscount=totalbill-200;
			totalbill-=membershipdiscount;
			System.out.println("Membership discount 200 applied");
		}
		System.out.println("Total amount to be paid is: "+totalbill);
		sc.close();
		
	}

}
