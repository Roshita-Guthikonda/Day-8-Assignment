package com.codegnan.controlstatements;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Total weight in kgs");
		double weight=s.nextDouble();
		System.out.println("Enter Height meters");
		double height=s.nextDouble();
		double bmi=weight/(height*height);
		String category;
		if(bmi<18.5){
			category="Underweight";
		}else {
			if(bmi>=18.5 && bmi<=24.9) {
				category="Normal";
			}else {
				if(bmi>25.0 && bmi<=29.9) {
					category="Over weight";
				}else {
					category="Obese";
				}
			}
		}
		System.out.printf("Your BMI is: %.2f%n", bmi);
		System.out.println("category:"+category);
		s.close();

	}

}
