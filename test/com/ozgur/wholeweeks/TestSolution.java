package com.ozgur.wholeweeks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ozgur.wholeweeks.Solution;

public class TestSolution {
	
	
	private Solution soln;


	@Before
    public  void setUp() {
		soln = new Solution();
    }
	
	
	@Test
	public void testFirstScenario() throws Exception {
		 
		//assertEquals(7, soln.solution(2014, "April", "May", "Wednesday"));
		
		
		assertEquals(12, soln.solution(2015, "January", "March", "Thursday"));
		
		assertEquals(16, soln.solution(2012, "March", "June", "Thursday"));
		
		
		assertEquals(8, soln.solution(2012, "July", "August", "Sunday"));
		
		assertEquals(12, soln.solution(2013, "February", "April", "Tuesday"));
		
		
		
		
	}
	
	
	@Test
	public void testIsLeapYear() throws Exception {
		assertFalse(soln.isLeapYear(2010));
		assertFalse(soln.isLeapYear(2011));
		assertTrue(soln.isLeapYear(2012));
		assertFalse(soln.isLeapYear(2014));
		assertFalse(soln.isLeapYear(2015));
		assertTrue(soln.isLeapYear(2016));
		
	}
	
	
	
	@Test
	public void testIsFirstDayMonday() throws Exception {
		assertFalse(soln.isFirstDayMonday(2016, "April"));
		assertTrue(soln.isFirstDayMonday(2016, "February"));
	}
	
	
	@Test
	public void testIsLastDayOfMonthSunday() throws Exception {
		assertFalse(soln.isLastDayOfMonthSunday(2016, "April"));
		assertTrue(soln.isLastDayOfMonthSunday(2017, "April"));

	}
	
	
	
	
	@Test
	public void testOrdinalOfMonth() throws Exception {
		assertEquals(0, soln.getOrdinalOfMonth("January"));
		assertEquals(1, soln.getOrdinalOfMonth("February"));
		assertEquals(2, soln.getOrdinalOfMonth("March"));
		assertEquals(3, soln.getOrdinalOfMonth("April"));
		assertEquals(4, soln.getOrdinalOfMonth("May"));
		assertEquals(5, soln.getOrdinalOfMonth("June"));
		assertEquals(6, soln.getOrdinalOfMonth("July"));
		assertEquals(7, soln.getOrdinalOfMonth("August"));
		assertEquals(8, soln.getOrdinalOfMonth("September"));
		assertEquals(9, soln.getOrdinalOfMonth("October"));
		assertEquals(10, soln.getOrdinalOfMonth("November"));
		assertEquals(11, soln.getOrdinalOfMonth("December"));
		
	}

	
}
