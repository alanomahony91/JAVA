package other;

public class DOB 
{
	public static void main(String[] args)
	{
		//Enter Date of Birth in format DD/MM/YYYY. Displays what day of the week you were born on.
		
		String dateOfBirth = "05/10/2015";
		
		System.out.println("Break down of the calculation");
		System.out.println("");
		
		String dayX = dateOfBirth.substring(0,2);
		String monthX = dateOfBirth.substring(3,5);  //break down the full string into date, month and year.
		String yearX = dateOfBirth.substring(6,10);
		
		String leapYear = dateOfBirth.substring(8,10);	//the last two numbers of the year need to be used for the leap year offset.
		
		String yearX1 = dateOfBirth.substring(9,10);	//the last digit of the year needs to be used in 'addition2' below.
		
		
		int day = Integer.parseInt(dayX);
		int month = Integer.parseInt(monthX);		//convert date month and year into ints to be used mathematically.
		int year = Integer.parseInt(yearX);
		
		
		int leapYr = Integer.parseInt(leapYear);		//convert the last two digits of the year into int.
		
		int yearDigit = Integer.parseInt(yearX1);		//convert the last digit of the year into int.
		
		int monthY = 0;
		int yearY = 0;
		
		
		
		System.out.println("(1) Day of the month = " + day);
		System.out.println("(2) Month of the year = " + month);		//test to display the correct day,month and year.
		System.out.println("(3) Year = " + year);
		
		
		
		//switch statement to change the month into the corresponding number.
		switch (month)		//the months each have specific numbers for the equation which don't correspond to the order they are in, e.g. January = 6, as opposed to January = 1.
		{
		case 1:monthY = 6;break;		//January
		case 2:monthY = 2;break;		//February
		case 3:monthY = 2;break;		//March
		case 4:monthY = 5;break;		//April
		case 5:monthY = 0;break;		//May
		case 6:monthY = 3;break;		//June
		case 7:monthY = 5;break;		//July
		case 8:monthY = 1;break;		//August
		case 9:monthY = 4;break;		//September
		case 10:monthY = 6;break;		//October
		case 11:monthY = 2;break;		//November
		case 12:monthY = 4;break;		//December
		default :System.out.println("Invalid Month");break;
		}
		
		
		//Decade Offset
		
		//similar to the months above, each decade has a specific number
		
		System.out.println("(4) Number associated with the specific month = " + monthY); //Test to see correct month addition for first equation. (addition1)
		
			if (year >=1900 & year <=1909)
			{
				yearY = 1;
			}
			else if (year >=1910 & year <=1919)
			{
				yearY = 6;
			}
			else if (year >= 1920 & year <= 1929)
			{
				yearY = 5;
			}
			else if (year >= 1930 & year <= 1939)
			{
				yearY = 3;
			}
			else if (year >= 1930 & year <= 1939)
			{
				yearY = 3;
			}
			else if (year >= 1940 & year <= 1949)
			{
				yearY = 2;
			}
			else if (year >= 1950 & year <= 1959)
			{
				yearY = 0;
			}
			else if (year >= 1960 & year <= 1969)
			{
				yearY = 6;
			}
			else if (year >= 1970 & year <= 1979)
			{
				yearY = 4;
			}
			else if (year >= 1980 & year <= 1989)
			{
				yearY = 3;
			}
			else if (year >= 1990 & year <= 1999)
			{
				yearY = 1;
			}
			else if (year >= 2000 & year <= 2009)
			{
				yearY = 0;
			}
			else if (year >= 2010 & year <= 2019)
			{
				yearY = 5;
			}
			
			
			System.out.println("(5) Number associated with specific year = " + yearY);  //test correct year addition for first part of equation.(addition1)
			
			
			int addition1;
			
			addition1 = (day + monthY + yearY);  //First part of equation. Finding the number associated with the day, month and year, excluding leap year.
			
			System.out.println("(6) Day of the month + Number associate with the month given + Number associated with year given = "+ addition1);
			
			
			int addition2;
			
			addition2 = (addition1 + yearDigit);	//Second part of equation. Adding addition1 to the yearDigit extracted earlier.
			
			System.out.println("(7) The single digit from the end of the year given, added to addition1 on the line above = " + addition2);
			
			
			
			
			
			//Leap Year Offset
			//below is a chart which shows how the leap year offset is found
			/*
			 * ____|0_|_1_|_2_|_3_|_4_|_5_|_6_|_7_|_8_|_9_|	<-- Decade ending in (eg. 1997 - 9(7) would equal 2 because the 9 is odd and 7 corresponds to 2 on the odd line.)
			 * even|0_|_0_|_0_|_0_|_1_|_1_|_1_|_1_|_2_|_2_|
			 * odd_|0_|_0_|_1_|_1_|_1_|_1_|_2_|_2_|_2_|_2_|
			 * 
			 */
			
			
			
			
			int addition3 = 0;
			
			
			if(leapYr >= 00 & leapYr <= 03 || leapYr == 10 || leapYr == 11 || leapYr >= 20 & leapYr <= 23 || leapYr == 30 || leapYr == 31 || leapYr >= 40 & leapYr <= 43 || leapYr == 50 || leapYr == 51 || leapYr >= 60 & leapYr <= 63 || leapYr == 70 || leapYr == 71 || leapYr >= 80 & leapYr <= 83 || leapYr == 90 || leapYr == 91)
			{
				addition3 = addition2;
			}
			else if(leapYr >= 04 & leapYr <= 07 || leapYr >= 12 & leapYr <= 15 || leapYr >= 24 & leapYr <= 27 || leapYr >= 32 & leapYr <= 35 || leapYr >= 44 & leapYr <= 47 || leapYr >= 52 & leapYr <= 55 || leapYr >= 64 & leapYr <= 67 || leapYr >= 72 & leapYr <= 75 || leapYr >= 84 & leapYr <= 87 || leapYr >= 92 & leapYr <= 95)
			{
				addition3 = addition2 + 1;
			}
			else if(leapYr >= 8 & leapYr <= 9)
			{
				addition3 = addition2 + 2;
			}
			else if(leapYr >= 16 & leapYr <= 19 || leapYr == 28 || leapYr == 29 || leapYr >= 36 & leapYr <= 39 || leapYr == 48 || leapYr == 49 || leapYr >= 56 & leapYr <= 59 || leapYr == 68 || leapYr == 69 || leapYr >= 76 & leapYr <= 79 || leapYr == 88 || leapYr == 89 || leapYr >= 96 & leapYr <= 99)
			{
				addition3 = addition2 + 2;
			}
			else
			{
				System.out.println("Invalid Year.");
			}
			
			
			System.out.println("(8) Display the total after the leap year offset is added, i.e. 0,1 or 2 = " + addition3);
			
			
			
			
			int dayOfWeek;
			
			dayOfWeek = (addition3 % 7);	//find the remainder after 7 to show the day of the week.
			
			System.out.println("(9) Remaining number corresponds to the day of the week, starting with Sunday '0' = " + dayOfWeek);
			
			System.out.println("");
			switch(dayOfWeek)	//the dayOfWeek remainder is put through here to output the day of the week.
			{
			case 0:System.out.println("You were born on a Sunday");break;
			case 1:System.out.println("You were born on a Monday");break;
			case 2:System.out.println("You were born on a Tuesday");break;
			case 3:System.out.println("You were born on a Wednesday");break;
			case 4:System.out.println("You were born on a Thursday");break;
			case 5:System.out.println("You were born on a Friday");break;
			case 6:System.out.println("You were born on a Saturday");break;
			default :System.out.println("OOPS! Something went wrong..");break;
			}
			
			}
}
