package com.codegnan.controlstatements;

import java.util.Scanner;

public class CalculateTaxPercentage {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Income");
		int income=s.nextInt();
		int taxPercent;
		if(income<=10000) {
			taxPercent=0;
		}else {
			if(income>10000 && income<=50000) {
				taxPercent=10;
			}
			else {
				if(income>50000 && income<=100000) {
					taxPercent=20;
				}else{
					taxPercent=30;
				}
			}
		}
		System.out.println(taxPercent+"%");
		s.close();




	}

}
