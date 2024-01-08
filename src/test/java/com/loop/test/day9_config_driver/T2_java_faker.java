package com.loop.test.day9_config_driver;

import org.testng.annotations.Test;
import com.github.javafaker.Faker;

public class T2_java_faker {

    @Test
    public void java_faker(){
        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().fullName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.date().birthday() = " + faker.date().birthday());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("202-###-####"));
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));
        System.out.println("faker.bothify(\"##??##?\") = " + faker.bothify("##??##?"));
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replace("Chuck Norris", "Feyruz"));
        System.out.println("faker.name().username() = " + faker.name().username());
        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());


    }

}