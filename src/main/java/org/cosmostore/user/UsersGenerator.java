package org.cosmostore.user;

import com.github.javafaker.Faker;

public class UsersGenerator {
    public static User generateEmailAndPasswordForUser(){
        Faker faker = new Faker();
        return new User(faker.internet().emailAddress(), faker.internet().password());
    }
}
