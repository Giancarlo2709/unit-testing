package com.platzi.javatest.discounts;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PriceCalculatorShould {

	@Test
	public void total_zero_when_there_are_prices() {
		PriceCalculator calculator = new PriceCalculator();
		assertThat(calculator.getTotal(), is(0.0));
	}
	
	@Test
	public void total_is_the_sum_of_prices() {
		PriceCalculator calculator = new PriceCalculator();
		calculator.addPrice(10.2);
		calculator.addPrice(15.5);
		assertThat(calculator.getTotal(), is(25.7));
	}
	
	@Test
	public void apply_discount_to_prices() {
		PriceCalculator calculator = new PriceCalculator();
		
		calculator.addPrice(12.5);
		calculator.addPrice(17.5);		
		calculator.setDiscount(25);		
		assertThat(calculator.getTotal(), is(22.5));
	}

}
