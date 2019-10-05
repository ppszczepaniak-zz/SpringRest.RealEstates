package com.example.RealEstates.models;

import java.util.StringJoiner;

public class Client extends AbstractModel {

    private final String firstName;
    private final String lastName;

    private Client(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Client of(String firstName, String lastName){
        return new Client(firstName,lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Client.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("id=" + id)
                .toString();
    }
}
