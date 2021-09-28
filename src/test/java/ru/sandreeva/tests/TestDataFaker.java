package ru.sandreeva.tests;
import com.github.javafaker.Faker;

import java.util.Date;

public class TestDataFaker {
    static Faker faker = new Faker();

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            phone = faker.phoneNumber().subscriberNumber(10),
            currentAddress = faker.address().fullAddress(),
            gender = "Female",
            month = "February",
            subject = "Math",
            hobby = "Sports",
            fileName = "img/1.png",
            state = "NCR",
            city = "Gurgaon";

    public static Integer
            day = faker.random().nextInt(1, 30);
    public static int year = faker.random().nextInt(1960, 2000);


    public static Date
            birthday = faker.date().birthday(15,60);



}


