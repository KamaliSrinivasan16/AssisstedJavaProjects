package test1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class junittest1 {
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before all test");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("Before each test");
	}
			
	@DisplayName("Standard test")
	@Test
	public void test() 
	{
		System.out.println("TEST 1");
	}
		
	@Test
	public void test1() 
	{
		System.out.println("TEST 2");
	}
	
	@Disabled
	@Test
	public void test2() 
	{
		System.out.println("TEST 3");
	}
	@AfterEach
	public void afterEach()
	{
		System.out.println("After each test");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("After all test");
	}
	


}
