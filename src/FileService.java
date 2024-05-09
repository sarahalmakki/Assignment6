package com.codercampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileService {
	public List<Car> readFromFile(String filePath) throws IOException {
		List<Car> cars = new ArrayList<>();
//	String[] filePath = { "modelX.txt", "modelS.txt", "model3.txt" };

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			reader.readLine();
			while ((line = reader.readLine()) != null) {
				String[] info = line.split(",");
//			System.out.println(Arrays.toString(info));
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy");

				Car carTemp = new Car(YearMonth.parse(info[0], formatter), Integer.parseInt(info[1]));

//			Declaring variables month , year, sale  

//			while ((line = reader.readLine()) != null) {
//			    String[] columns = line.split(",");
//			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy");
//			    Sales salesTemp = new Sales(YearMonth.parse(columns[0], formatter),
//			            Integer.parseInt(columns[1]));
//			    sales.add(salesTemp);
//			}
//			return sales;

//			format 
//			Car car = new Car(sales,date);
				cars.add(carTemp);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cars;
	}
//	public int parseYear(String yearString) {
//		yearString = yearString.split("-")[];
//		return Integer.parseInt(yearString);
//		
//	}
//   public int parseMonth(String monthString) {
//	return Integer.parseInt(monthString);
//	 

}
