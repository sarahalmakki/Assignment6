package com.codercampus;

import java.time.YearMonth;

public class Car {

	YearMonth date;
	Integer sales;

	public Car(YearMonth date, Integer sales) {
//	create a DataTimeFormatter with pattern and a local of correct parsing

		this.date = date;
		this.sales = sales;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public YearMonth getDate() {
		return date;
	}

	public void setDate(YearMonth date) {
		this.date = date;
	}

}
