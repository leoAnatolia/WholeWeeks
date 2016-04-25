package com.ozgur.wholeweeks;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
	
	public enum  MONTH {
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		October,
		November,
		December
	};
	
	public int solution(int Y, String A, String B, String W){
		
		/*
		 * 
		 * Y=2014 A="April" B ="May" W="Wednesday"
		 * 
		 */
		
		int returnVal = 0;
		
		
		for (int i = getOrdinalOfMonth(A); i <= getOrdinalOfMonth(B); i++) {
		}
		
		
		Calendar c1 = Calendar.getInstance();
		c1 = new GregorianCalendar(Y, getOrdinalOfMonth(A), 1);
		
		
		Calendar c2 = Calendar.getInstance();
		c2 = new GregorianCalendar(Y, getOrdinalOfMonth(B), getTotalDayCountOfMonth(Y, 1 + getOrdinalOfMonth(B)));
		
		
		
		returnVal = 1 + c2.get(Calendar.WEEK_OF_YEAR)-c1.get(Calendar.WEEK_OF_YEAR);  
		
		
		
		if(! isFirstDayMonday(Y,A)){
			returnVal--;
		}
	
		
		if(! isLastDayOfMonthSunday(Y,B)){
			returnVal--;
		}		
		
		return returnVal;
		
		
	}
	

	public boolean isFirstDayMonday(int year, String _month) {

		
		Calendar c = Calendar.getInstance();
		
		c = new GregorianCalendar(year,getOrdinalOfMonth(_month),1);
		
		
		return (c.get(Calendar.DAY_OF_WEEK) == 2);
	}

	public boolean isSecondDayMonday(int year, String _month) {

		
		Calendar c = Calendar.getInstance();
		
		c = new GregorianCalendar(year,getOrdinalOfMonth(_month),2);
		
		
		return (c.get(Calendar.DAY_OF_WEEK) == 2);
	}
	
	public boolean isLastDayOfMonthSunday(int year, String month_b) {
		Calendar c = Calendar.getInstance();
		
		c = new GregorianCalendar(year,getOrdinalOfMonth(month_b),getTotalDayCountOfMonth(year, 1+getOrdinalOfMonth(month_b)));
		
		
		return (c.get(Calendar.DAY_OF_WEEK) == 1);
	}
	public int getTotalDayCountOfMonth(int year, int monthIndex){
		int totalDayCountInThisMonth = 30;
		
		
		switch (monthIndex) {
		case 1:
			totalDayCountInThisMonth = 31;
			break;
		case 2:
		{
			if(isLeapYear(year))
			totalDayCountInThisMonth = 29;
			else
				totalDayCountInThisMonth = 28;
		}
			break;
		case 3:
			totalDayCountInThisMonth = 31;
			break;
		case 4:
			totalDayCountInThisMonth = 30;
			break;
		case 5:
			totalDayCountInThisMonth = 31;
			break;
		case 6:
			totalDayCountInThisMonth = 30;
			break;
		case 7:
			totalDayCountInThisMonth = 31;
			break;
		case 8:
			totalDayCountInThisMonth = 31;
			break;
		case 9:
			totalDayCountInThisMonth = 30;
			break;
		case 10:
			totalDayCountInThisMonth = 31;
			break;
		case 11:
			totalDayCountInThisMonth = 30;
			break;
		case 12:
			totalDayCountInThisMonth = 31;
			break;

		default:
			break;
		}
		
		
		return totalDayCountInThisMonth;
	}

	public boolean isLeapYear(int year) {

		boolean isALeapYear = false;
		
		isALeapYear = (year % 4) == 0; 
		
		return isALeapYear;
	}
	
	
	protected int getOrdinalOfMonth(String _month){
		int ordinalValue = -1;
		
		switch (_month) {
		case "January":
			ordinalValue = MONTH.January.ordinal();
			break;
		case "February":
			ordinalValue = MONTH.February.ordinal();
			break;
		case "March":
			ordinalValue = MONTH.March.ordinal();
			break;
		case "April":
			ordinalValue = MONTH.April.ordinal();
			break;
		case "May":
			ordinalValue = MONTH.May.ordinal();
			break;
		case "June":
			ordinalValue = MONTH.June.ordinal();
			break;
		case "July":
			ordinalValue = MONTH.July.ordinal();
			break;
		case "August":
			ordinalValue = MONTH.August.ordinal();
			break;
		case "September":
			ordinalValue = MONTH.September.ordinal();
			break;
		case "October":
			ordinalValue = MONTH.October.ordinal();
			break;
		case "November":
			ordinalValue = MONTH.November.ordinal();
			break;
		case "December":
			ordinalValue = MONTH.December.ordinal();
			break;

		default:
			break;
		}
		return ordinalValue;
		
	}

}
