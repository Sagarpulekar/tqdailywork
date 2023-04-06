package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {
		
		 TreeMap<Customer, Order> cmap= new TreeMap<>(new NameComparator());
		    cmap.put(new Customer(101,"Shuruti",786544), new Order(5,"PenDrive",780f));
		    cmap.put(new Customer(100,"Sagar",786541), new Order(2,"Laptop",78000f));
		    cmap.put(new Customer(99,"Priya",796041), new Order(1,"Earphones",1200f));
		    

		  for(Map.Entry<Customer, Order> en: cmap.entrySet())
		  {
			  System.out.println(en.getKey());
			  System.out.println(en.getValue());
		  }
		  
		
		  
		  

	}

}
