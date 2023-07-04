package Fruite_management_System;

import java.util.ArrayList;



public class FruitMethod {
	
	public static void findTotalprice(ArrayList<Fruit> ftd) {
		int total=0;
		for (Fruit fruit : ftd) {
			if (fruit != null) {
				total=total+fruit.getPrice();
				System.out.println("the Total price For all Fruits is :"+total);
			
			}
		}
	}
	
	
	public static void findByFruitName(ArrayList<Fruit> ftd, String Fruitname) {
		for (Fruit fruit : ftd) {
			if (fruit != null) {
				if ((fruit.getName().toString()).equals(Fruitname)) {
					System.out.println("Total quantity of "+fruit.getName()+": "+fruit.getQuantity());
				}
			} else {
				System.out.println("No Fruit register");
			}
		}
	}

	public static void deleteFruit(ArrayList<Fruit> ftd, String name) {
		int index = -1;
		for (Fruit fr : ftd) {
			if (fr != null) {
				if (fr.getName().equalsIgnoreCase(name)) {
					index = ftd.indexOf(fr);

				}
			}
		}
		if (index >= 0) {
			ftd.remove(index);
			System.out.println("Fruit is remove");
		} else {
			System.out.println("No Fruit register");
		}
	}
}


