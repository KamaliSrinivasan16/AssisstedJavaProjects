package test2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest 
{
	@Test
	void test() {
		Calculation obj=new Calculation();
		assertEquals(11, obj.addition(5,6));
	}


}
