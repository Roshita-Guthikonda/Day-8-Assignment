package com.codegnan.controlstatements;

import java.util.Scanner;

public class BonusForEmployees {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter experience of an employee");
		int experience=s.nextInt();
		System.out.println("Enter performance Score");
		double bonus=0;
		int performance=s.nextInt();
		int baseSalary=0;
		if(experience<2) {
			baseSalary=30000;
		}
		else{
			if(experience>=2 && experience<=5){
				baseSalary=50000;
		}else {
			baseSalary=70000;
			}
		}
		if(performance>=8) {
			bonus=baseSalary*0.1;
			//baseSalary+=bonus;
		}
		baseSalary+=bonus;
		System.out.println("The salary of an employee including bonus is: "+baseSalary);
		s.close();

	}

}
