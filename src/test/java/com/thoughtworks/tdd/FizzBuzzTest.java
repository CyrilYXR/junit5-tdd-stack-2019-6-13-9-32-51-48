package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_number_is_1(){
        // GIVEN
        int number = 1;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("1", result);
    }

    @Test
    public void should_return_2_when_number_is_2(){
        // GIVEN
        int number = 2;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("2", result);
    }

    @Test
    public void should_return_Fizz_when_number_is_3(){
        // GIVEN
        int number = 3;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Fizz_when_number_is_6(){
        // GIVEN
        int number = 6;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void should_return_Buzz_when_number_is_5(){
        // GIVEN
        int number = 5;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Buzz_when_number_is_10(){
        // GIVEN
        int number = 10;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void should_return_Whizz_when_number_is_7(){
        // GIVEN
        int number = 7;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_Whizz_when_number_is_14(){
        // GIVEN
        int number = 14;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_15(){
        // GIVEN
        int number = 15;
        // WHEN
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convert(number);
        // THEN
        Assertions.assertEquals("FizzBuzz", result);
    }


}
