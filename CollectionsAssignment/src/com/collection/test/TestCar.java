package com.collection.test;

import java.util.TreeSet;

import com.collection.app.Car;

public class TestCar { 
	  
	 public static void main(String args[]) 
	 { 
	 TreeSet<Car> treeset = new TreeSet<>(); 
	  
	 treeset.add(new Car("SLA", 600000, 1998, "Mercedes Benz")); 
	 treeset.add(new Car("Figo", 300000, 1990, "Ford")); 
	 treeset.add(new Car("SX4", 200000, 1890, "Maruti Suzuki")); 
	 treeset.stream().forEach((name) -> System.out.println(name)); 
	 
	 } 
	 } 
