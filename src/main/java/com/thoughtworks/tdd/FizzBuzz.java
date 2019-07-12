package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int number) {
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        if(number == 7){
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
