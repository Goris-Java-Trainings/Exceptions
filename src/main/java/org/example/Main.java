package org.example;

import org.example.exception.PersonException;

import java.io.FileNotFoundException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, NumberFormatException {

        // NullPointerException

//        Person person = new Person();
//        person.setName("cdres");
//        System.out.println(person.getName().charAt(0));

        // ArithmeticException
        /*int a = 4, b = 0;

        System.out.println(a/b);*/

        // ArrayIndexOutOfBoundsException
        /*int[] numbers = new int[2];
        numbers[0] = 3;
        numbers[1] = 13;
        numbers[2] = 3123;

        System.out.println(numbers);*/

        // NumberFormatException

        // Exception handling

        try {
            Person person = new Person(UUID.randomUUID());
            person.setName("Vvfreve%");
            person.setAge(1);
            person.setEmail("fgtregtre@vrfdsvs.com");

            System.out.println(person);
        } catch (PersonException pe) {
            System.out.println(pe.getMessage());
        }

        System.out.println("After exception");
    }

    private static void exceptionHandling() throws IllegalAccessException {
        try {
            // 1
            System.out.println("1| Start");
            Integer.parseInt("0", 10);

            // 2
            System.out.println("2| After parseInt method");
            Person person = new Person();
            person.print(3);
        } catch (FileNotFoundException nfe) {
            // 3
            System.out.println("3| Caught an NumberFormatException");
            throw new IllegalAccessException(nfe.getMessage());
        } catch (UnsupportedCharsetException uce) {
            // 4
            System.out.println("4| Caught an UnsupportedCharsetException");
        } finally {
            // 5

            System.out.println("5| This is a finally block!");
        }
        // 6

        System.out.println("6| HELLO WORLD");
    }
}

// 1. No exceptions -> 1, 2, 5, 6
// 2. There is an exception which is being caught by catch block (without rethrowing an exception) -> 1, 3, 5, 6
// 3. There is an exception which is being caught by catch block (with rethrowing an exception) -> 1, 3, 5
// 4. There is an exception which is not caught by any catch block -> 1, 5