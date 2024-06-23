package utils;

import com.github.javafaker.Faker;

public class ReusableMethods {

    public static String number()
    {
        Faker fake = new Faker();
        return fake.number().digits(10);

    }
}
