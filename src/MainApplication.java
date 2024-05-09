package com.codercampus;

import java.io.IOException;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileService fileService = new FileService();
		List<Car> modelX = fileService.readFromFile("modelX.txt");
		List<Car> modelS = fileService.readFromFile("modelS.txt");
		List<Car> model3 = fileService.readFromFile("model3.txt");
		AdditionalService additionalService = new AdditionalService();
		additionalService.printSales(model3);
		System.out.println("--------------------------------");
		additionalService.printSales(modelX);
		System.out.println("--------------------------------");
		additionalService.printSales(modelS);

		additionalService.calculateTheOutput(model3);
		System.out.println("--------------------------------");
		additionalService.calculateTheOutput(modelX);
		System.out.println("--------------------------------");
		additionalService.calculateTheOutput(modelS);


	}
}
