package bt3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
   @Test
    void testTranslate(){
       int number=13;
       String expected="Fizz";
       String result=FizzBuzzTranslate.getSearch(number);
       assertEquals(expected,result);
   }
}