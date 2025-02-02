package com.zinnia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

public class FakerUtils {
	
	
	private static final Faker faker = new Faker(Locale.US);

    // Getter method for first name
    public static String getFirstName() {
        return faker.name().firstName();
    }

    // Getter method for last name
    public static String getLastName() {
        return faker.name().lastName();
    }

    // Getter method for email address
    public static String getEmailAddress() {
        return faker.internet().emailAddress();
    }

    // Getter method for date of birth between two dates
    public static String getDOB()
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = sdf.parse("06/04/1940");
            endDate = sdf.parse("06/04/2000");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date randomDOB = faker.date().between(startDate, endDate);
        return sdf.format(randomDOB);
    }
    
    public static String getPrimaryOwnerDOB()
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = sdf.parse("06/04/1940");
            endDate = sdf.parse("06/04/1950");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date randomDOB = faker.date().between(startDate, endDate);
        return sdf.format(randomDOB);
    }

    // Getter method for street address
    public static String getStreetAddress() {
        return faker.address().streetAddress();
    }

    // Getter method for city of a particular state
    public static String getCityOfState(String state) {
        return faker.address().cityName();
        // Note: Faker does not have a built-in method to specify a city for a particular state
        // If needed, you can create a custom list of cities for specific states or use another method to achieve this.
    }
    
    public static String getCity()
    {
    	return faker.address().city();
    }
    
    public static String getState()
    {
    	return faker.address().state();
    }

    // Getter method for postal code of a particular city
    public static String getPostalCodeOfCity(String city) {
        return faker.address().zipCode();
        // Note: Faker provides postal codes, but they are not specific to a city.
        // If needed, you may need to handle this with additional logic or external data.
    }

    public static String getCurrentDate()
    {
    	LocalDate currentDate = LocalDate.now();
        return currentDate.format(java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
    
    public static String getInstituteName() {
        return faker.university().name();
    }
    
    public static String entityName()
    {
    	return faker.company().name();
    }
    
    public static String number()
    {
    	String singleDigit = faker.number().digit();
    	return singleDigit;
    }
  
    
 // Getter method for random number with specified length (2, 3, or 4 digits)
    public static String getRandomNumber(int digits) {
    	if (digits < 1 || digits > 10) {
            throw new IllegalArgumentException("Number of digits must be between 2 and 10");
        }
    	long randomNumber = faker.number().randomNumber(digits, true);
        return String.valueOf(randomNumber);
    }

}
