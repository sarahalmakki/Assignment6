package com.codercampus;

import java.time.LocalDate;
import java.util.List;

public class Car {
LocalDate date;
int sales;
String model;


public Car(LocalDate date,int sales,String model, List<Car> fromFile) {
	// TODO Auto-generated constructor stub
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public int getSales() {
	return sales;
}
public void setSales(int sales) {
	this.sales = sales;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}

}


