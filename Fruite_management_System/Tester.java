package Fruite_management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	
private static final String FruitMethods = null;

public static void main(String[] args) {
		
		
		
		ArrayList<Fruit> ftd = new ArrayList<>();
		boolean flag = false;
		Fruit ftd1 = new Fruit();
		Fruit f=null;
		try(Scanner sc = new Scanner(System.in)){
			
		while(flag==false) {
		try {
		
				System.out.println("1.Add New Fruit.");
				System.out.println("2.View Fruits Details.");
				System.out.println("3.View Fruit Quantity");
				System.out.println("4.Show total price:");
				System.out.println("5.Delete Fruit Information.");
				System.out.println("6.Exit.");
				
				
				switch (sc.nextInt()) {
				
				case 1:{
					System.out.println("Enter Fruit details");
					System.out.println("1)Name \n 2)Price \n 3)Quantity \n ");
					f=new Fruit(sc.next(),sc.nextInt(),sc.nextInt());
				     if(ftd.add(f)) {
				    	System.out.println("Fruits Register Succesfully \n"); 
				     }
				     else {
				    	System.out.println("Fruits Registration Fails..!"); 
				     }
					break;
				
				}
				case 2:{
					System.out.println(ftd);
					
					break;
				
				 
			 }
				case 3:{
					System.out.println("Enter the Fruits Name");
					String fname=sc.next();
					FruitMethod.findByFruitName(ftd, fname);
					break;
				}
				case 4:{
					FruitMethod.findTotalprice(ftd);
					
					break;
					
				}
				case 5:{
					System.out.println("Enter Fruits Name");
					String name=sc.next();
					
					FruitMethod.deleteFruit(ftd, name);
					break;
				}
				
				case 6:{
					System.out.println("----------------Exit------------------");
					flag=true;
					break;
				}
			}
		
		}
		
		catch(Exception e) {
			System.out.println("you hava enter wrong information or choosen wrong choices");
			System.out.println("Try again...! or Press 6 to exit from application");
		}
		}
		
		}

	}

}


