package com.revature.beans;

import java.util.*;

public class Driver {
	
	
	//utilizing wrapper class
	static Integer w = 10;
			
	public static void main(String[] args) {
		
		
		// Instantiates objects for each class
		Car c1 = new Car();
		Car c2 = new Car();
		
		Human h1 = new Human();
		Human h2 = new Human();
		
		//Take input from user to instantiate object values
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Name of 1st person : ");
        h1.setName(scan.nextLine());
        
        System.out.println(" Enter City of 1st person : ");
        h1.setCity(scan.nextLine());
        
        System.out.println(" Enter Height of 1st person <for ex. 5 feet 6 inches - enter 5.6> : ");
        h1.setHeight(sc.nextDouble());
        
        System.out.println(" Enter Weight of 1st person <in pounds> : ");
        h1.setWeight(sc.nextDouble());
        
        System.out.println(h1.toString());
		
        System.out.println(" Enter Name of 2nd person : ");
        h2.setName(scan.nextLine());
        
        System.out.println(" Enter City of 2nd person : ");
        h2.setCity(scan.nextLine());
        
        System.out.println(" Enter Height of 2nd person <for ex. 5 feet 6 inches - enter 5.6> : ");
        h2.setHeight(sc.nextDouble());
        
        System.out.println(" Enter Weight of 2nd person <in pounds> : ");
        h2.setWeight(sc.nextDouble());
        
        System.out.println(h2.toString());
        
        System.out.println(" Enter Make of 1st car : ");
        c1.setMake(scan.nextLine());
        
        System.out.println(" Enter Model of 1st car : ");
        c1.setModel(scan.nextLine());
        
        System.out.println(" Enter Year of 1st car : ");
        c1.setYear(sc.nextInt());
        
        System.out.println(" Enter Color of 1st car : ");
        c1.setColor(scan.nextLine());
        
        System.out.println(" Enter Make of 2nd car : ");
        c2.setMake(scan.nextLine());
        
        System.out.println(" Enter Model of 2nd car : ");
        c2.setModel(scan.nextLine());
        
        System.out.println(" Enter Year of 2nd car : ");
        c2.setYear(sc.nextInt());
        
        System.out.println(" Enter Color of 2nd car : ");
        c2.setColor(scan.nextLine());
        
        //If statement to compare height and weight among human
        if(h1.getHeight()>h2.getHeight()) {
        	System.out.println(h1.getName()+" is taller than "+ h2.getName());
        }
        else if(h1.getHeight()<h2.getHeight()) {
        	System.out.println(h2.getName()+" is taller than "+ h1.getName());
        }
        else {
        	System.out.println(h1.getName()+" and "+ h1.getName()+", both having same height.");
        }
        
        //Switch Statement to Check car color
        
        switch(c1.getColor()){
        	case "Black" :
				System.out.println("The 1st car color is Black");
				break;
			case "White" :
				System.out.println("The 1st car color is White");
				break;
			case "Blue" :
				System.out.println("The 1st car color is Blue");
				break;
			case "Magentta" :
				System.out.println("The 1st car color is Magentta");
				break;
			default :
				System.out.println("The 1st car color is "+c1.getColor());
		 
        }
        
        //for loop to print numbers from 0 to 10
        for(int i=0; i<=10; i++) {
        	System.out.print("\t"+i);
        }
        
        // while inside do 
        
        
        int ans=0, num=0;
        String ch;
        
        do {
        	
        	System.out.println("\nEnter the number you want to add");
        	num = sc.nextInt();
        	
        	
        	ans = ans+num;
        	
        	System.out.println("Do you want to add another number <Y/N> :");
        	ch = scan.next();
        	
        }while(ch.equalsIgnoreCase("Y"));
        
        System.out.println("Total is : "+ans);
        
        int[] myArray = {12,21,25,23,24,20,35,36,30,45,90,100};
        for(int a:myArray) {
			System.out.print("\t"+a);
		}
        
        System.out.print("\n");
        int j=1;
        while(j<=20)
        {
        	System.out.println(j);
        	j++;
        }
        
           
	}
	
	static int add(int n1, int n2) {
		System.out.println(n1+n2);
		return n1+n2;
	}
	
	static double add(double a1, double a2) {
		System.out.println(a1+a2);
		return a1+a2;
	}
	
	static int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	
}
