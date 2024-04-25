package com.codercampus;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {
	public List<Car> readFromFile(String filePath) throws FileNotFoundException {
		List<Car> car = new ArrayList<>();
		String[] paths = { "modelX.txt", "modelS.txt", "model3.txt" };
		List<String> modelX = new ArrayList<>();
		List<String> model3 = new ArrayList<>();
		List<String> modelS = new ArrayList<>();

		for (String path : paths) {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			try {
				while ((line = reader.readLine()) != null) {
					if (path.equals("modelX.txt")) {
						modelX.add(line);
					} else if (path.equals("modelS.txt")) {
						modelS.add(line);
					} else if (path.equals("modelS.txt")) {
						model3.add(line);

					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("File path wasnt found");
			}
			

		}
		return car;
	}

	
}
