package org.example;

import java.io.FileNotFoundException;
import java.nio.charset.UnsupportedCharsetException;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(int number) throws UnsupportedCharsetException, FileNotFoundException {
        if(number < 0) {
            throw new ArithmeticException("dfcrew");
        } else if(number > 1000000) {
            throw new FileNotFoundException("cxrec");
        }
    }
}
