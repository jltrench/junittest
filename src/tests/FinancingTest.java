package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import exentities.Financing;

public class FinancingTest {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		//arrange
		
		
		//action
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//asserts
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		//arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//action
		f.setTotalAmount(90000.0);
		
		//asserts
		Assertions.assertEquals(90000.0, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		//arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//action
		f.setIncome(2100.0);
		
		//asserts
		Assertions.assertEquals(2100.0, f.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldCreateObjectWhenValidData() {
		
		//arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//action
		f.setMonths(81);
		
		//asserts
		Assertions.assertEquals(81, f.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
			f.setMonths(79);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(20000.0, f.entry());
	}
	
	@Test
	public void quotaShouldCalculateEntryCorrectly() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1000.0, f.quota());
	}

}
