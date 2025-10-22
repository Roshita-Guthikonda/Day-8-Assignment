package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter light state (Gree/yellow/red)");
		String lightState=sc.next();
		System.out.println("Enter hour (0-23)");
		int hour=sc.nextInt();
		boolean isDayTime= (hour >=6 && hour <=18);
		String action;
		if(lightState.equalsIgnoreCase("green")) {
			action="Go";
		}else {
			if(lightState.equalsIgnoreCase("red")) {
				action="stop";
			}else {
				if(lightState.equalsIgnoreCase("yellow")) {
					if(isDayTime) {
						action="slow";
					}else {
						action="stop";
					}
				}else {
					action="Invalid Light state";
				}
		  }
		
      }
		System.out.println(action);
        sc.close();	
     }
}
