package bt1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    void testNextDay(){
        int day=29;
        int month=2;
        int year=2020;
        String expected="1/3/2020";
        String result=NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void testNextDay2(){
        int day=31;
        int month=3;
        int year=2020;
        String expected="1/1/2021";
        String result=NextDayCalculator.nextDay(day,month,year);
        assertEquals(expected,result);
    }

}