package com.codercampus;

import java.time.YearMonth;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AdditionalService {
	public  void printSales(List<Car> list) {
		Map<YearMonth, Integer> newMap = list.stream().filter(item -> item.getDate() != null).distinct()
				.collect(Collectors.groupingBy(Car::getDate, Collectors.summingInt(Car::getSales)));
		newMap.entrySet().stream().forEach(item -> System.out.println(item.getKey() + " -> " + item.getValue()));
	}

	public  void calculateTheOutput(List<Car> list) {
		Map<YearMonth, Integer> newMap = list.stream()
				.collect(Collectors.groupingBy(Car::getDate, Collectors.summingInt(Car::getSales)));
		Optional<Entry<YearMonth, Integer>> bestMonthEntry = newMap.entrySet().stream()
				.max(Comparator.comparingInt(Map.Entry::getValue));
		Optional<Entry<YearMonth, Integer>> worstMonthEntry = newMap.entrySet().stream()
				.min(Comparator.comparingInt(Map.Entry::getValue));
		if (bestMonthEntry.isPresent()) {
         	YearMonth worstMonth = worstMonthEntry.get().getKey();
     		int sales = worstMonthEntry.get().getValue();
			Entry<YearMonth, Integer> bestMonth = bestMonthEntry.get();
			System.err.println("The best month for " + bestMonthEntry.get());
		}

		if (bestMonthEntry.isPresent()) {
			
			Entry<YearMonth, Integer> worstMonth = bestMonthEntry.get();
			System.err.println("The worst month for " + worstMonthEntry.get());
		}

	}

}
