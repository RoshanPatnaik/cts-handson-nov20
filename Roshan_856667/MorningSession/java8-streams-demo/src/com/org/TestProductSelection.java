package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestProductSelection {

	public static void main(String[] args) {
		List<Laptop> laptops = Laptop.fetchLaptops();
		List<Laptop> particularLaptops = new ArrayList<Laptop>();
		for(Laptop laptop : laptops) {
			if(laptop.getBrandName().equals("Acer")) {
				particularLaptops.add(laptop);
			}
		}
		Collections.sort(particularLaptops, (l1,l2) -> Double.compare(l2.getRatings(), l1.getRatings()));
		particularLaptops.forEach(laptop -> System.out.println(laptop));
	}

}
