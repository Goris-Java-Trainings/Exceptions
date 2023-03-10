package org.example;

import org.example.exception.PersonException;

import java.io.FileNotFoundException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    public static final Pattern VALID_NAME_REGEX =
            Pattern.compile("^[A-Z][a-z]+");

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    private String name;
    private UUID id;
    private String email;
    private int age;

    public Person(){}

    public Person(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Matcher matcher = VALID_NAME_REGEX.matcher(name);
        if(!matcher.matches()) {
            throw new PersonException("Invalid name");
        }
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        if(!matcher.matches()) {
            throw new PersonException("Invalid email");
        }
        this.email = email;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new PersonException("Person age should be greater than 0");
        }
        this.age = age;
    }

    public void print(int number) throws UnsupportedCharsetException, FileNotFoundException {
        if(number < 0) {
            throw new ArithmeticException("dfcrew");
        } else if(number > 1000000) {
            throw new FileNotFoundException("cxrec");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
