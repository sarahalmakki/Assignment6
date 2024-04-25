package com.codercampus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileService fileService = new FileService();
	    List<Car> cars = new ArrayList<>();
	    cars.add(new Car("modelX", fileService.readFromFile("modelX.txt")));
	    cars.add(new Car("modelS", fileService.readFromFile("modelS.txt")));
        cars.add(new Car("model3", fileService.readFromFile("model3.txt")));	
	}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("The best month for Model 3 was: yyyy-MM");
		System.out.println("The worst month for Model 3 was: yyyy-MM");
		
}

	private static void generateYearlySalesReport(List <Car> cars)  {
		// TODO Auto-generated method stub
		cars.stream()
			 .Map(Car car: cars);
				                
		System.out.println("Model 3 Yearly Sales Report");
		System.out.println("Model X Yearly Sales Report");
	}
}