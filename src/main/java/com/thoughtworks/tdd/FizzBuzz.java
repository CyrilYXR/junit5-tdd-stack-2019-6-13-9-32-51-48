package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int number) {
        if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            return "FizzBuzzWhizz";
        }
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        if(number % 3 == 0 && number % 7 == 0){
            return "FizzWhizz";
        }
        if(number % 5 == 0 && number % 7 == 0){
            return "BuzzWhizz";
        }

        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        if(number % 7 == 0){
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
